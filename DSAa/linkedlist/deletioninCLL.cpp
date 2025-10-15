#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node *next;
    Node()
    {
        next = NULL;
    }
    void insertionAthead(Node* &head,int d); 
    void insertionAtTail(Node* &head,int d);
    void deletion(Node* &head,int d);
};
void Node::deletion(Node* &head,int d)
{
    Node *cur = head;
    //head need to deleted
    if(head->data==d)
    {
        
        do{
            cur = cur->next;
        }
        while(cur->next!=head);
        cur->next = head->next;

        Node *temp = head;
        head = head->next;
        free(temp);
        return;
    }
 
    do
    {
        if(cur->next->data==d)
        {
            Node *temp = cur->next;
            cur->next = cur->next->next;
            free(temp);
            return;
        }
        cur = cur->next;
    } while(cur->next!=head);
    if(cur->next==head)
    {
        cout<<"No element to be deleted"<<endl;
        return;
    }
 
}
void Node::insertionAtTail(Node* &head,int d)
{
    Node* temp = new Node;
    temp->data = d;
    if(head==NULL)
    {
        head = temp;
        head->next = temp;
        return;
    }
    else
    {
        Node* cur = head;

        do{
            cur = cur->next;
        }
        while(cur->next!=head);

        cur->next = temp;
        temp->next = head;
    }
}

void Node::insertionAthead(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;
    if(head==NULL)
    {
        head = temp;
        head->next = head;
        return;

    }
    else
    {
        temp->next = head;
        Node *cur = head;
        do
        {
            cur = cur->next;
        } while (cur->next!=head);
        cur->next = temp;
        head = temp;
    }
}
int main()
{
    Node *head = NULL;
    Node CDL;

    CDL.insertionAthead(head,10);
    CDL.insertionAthead(head,20);
    CDL.insertionAthead(head,30);
    CDL.insertionAthead(head,40);

    CDL.insertionAtTail(head,8);
    CDL.insertionAtTail(head,5);
    CDL.insertionAtTail(head,3);
    
    CDL.deletion(head,40);
    CDL.deletion(head,10);
    CDL.deletion(head,3);
    CDL.deletion(head,200);
    
    Node *cur = head;
    do{
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
    while(cur!=head);

}