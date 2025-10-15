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
    void insertionAtHead(Node* &head,int d);
    void insertionAtTail(Node* &head,int d);
    void insertionMiddle(Node* &head,int d,int newData);
};
void Node::insertionMiddle(Node* &head,int d,int newData)
{
    Node *temp = new Node;
    temp->data = newData;
    if(head==NULL)
    {
        cout<<"N0 list has been created yet"<<endl;
        return;
    }
    Node *cur = head;
    do
    {
        if(cur->data == d)
        {
            temp->next = cur->next;
            cur->next = temp;
            return;
        }

        cur = cur->next;
    } while(cur->data!=d && cur->next!=head);

    temp->next = cur->next;
    cur->next = temp;
    
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

void Node::insertionAtHead(Node* &head,int d)
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
        
        } while(cur->next!=head);

        cur->next = temp;
        head = temp;
        
    }

}
int main()
{
    Node *head = NULL;
    Node CLL;

    CLL.insertionAtHead(head,10);
    CLL.insertionAtHead(head,20);
    CLL.insertionAtHead(head,30);
    CLL.insertionAtHead(head,40);

    CLL.insertionAtTail(head,8);
    CLL.insertionAtTail(head,5);
    CLL.insertionAtTail(head,3);
    
    CLL.insertionMiddle(head,10,15);
    CLL.insertionMiddle(head,3,1);
    CLL.insertionMiddle(head,20,25);
    CLL.insertionMiddle(head,100,15);
    
    Node *cur = head;
    
    do{
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
    while(cur!=head);
    
}