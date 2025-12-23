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
    void insertionAtTail(Node* &head,int d);
    void insertionAtHead(Node* &head,int d);
    void deletion(Node* &head,int d);

};
void Node::deletion(Node* &head,int d)
{
    //if no linkedlist created
    if(head==NULL)
    {
        cout<<"No linked list ever created"<<endl;
        return;
    }

    //check for head data to be deleted
    if(head->data==d)
    {
        Node *temp = head;
        head = head->next;
        free(temp);
        return;
    }
    //if it is a middle element or last element
    Node *cur = head;
    while(cur->next!=NULL && cur->next->data!=d)
    {
        cur = cur->next;
    }
    if(cur->next==NULL)
    {
        cout<<"NO element found to be deleted"<<endl;
        return;
    }
    else
    {
        Node *temp = cur->next;
        cur->next = cur->next->next;
        free(temp);
    }
}
void Node:: insertionAtTail(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;
    if(head==NULL)
    {
        head = temp;
    }
    else
    {
        Node *cur = head;
        while(cur->next!=NULL)
        {
            cur = cur->next;
        }
        cur->next = temp;
    }
}
void Node::insertionAtHead(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;
    if(head==NULL)
    {
        head = temp;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
}
int main()
{
    Node ll;
    Node *head = NULL;

    ll.insertionAtTail(head,10);
    ll.insertionAtTail(head,20);
    ll.insertionAtTail(head,30);
    ll.insertionAtTail(head,40);
    ll.insertionAtTail(head,50);

    ll.insertionAtHead(head,8);
    ll.insertionAtHead(head,5);

    ll.deletion(head,20);
    ll.deletion(head,60);

    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
 
}