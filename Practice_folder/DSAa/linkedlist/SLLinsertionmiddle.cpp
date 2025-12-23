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
    void insertionAtMiddle(Node* &head,int data,int newdata);

};
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

void Node::insertionAtMiddle(Node* &head,int data,int newdata)
{
    Node* cur = head;
    while(cur->data!=data && cur->next!=NULL)
    {
        cur = cur->next;
    }
    Node *temp = new Node;
    temp->data = newdata;
    temp->next = cur->next;
    cur->next = temp;
}
 
int main()
{
    Node ll;
    Node *head = NULL;

    ll.insertionAtTail(head,10);
    ll.insertionAtTail(head,20);
    ll.insertionAtTail(head,30);
    ll.insertionAtTail(head,40);

    ll.insertionAtMiddle(head,5,45);

    ll.insertionAtHead(head,5);
    ll.insertionAtHead(head,7);

    ll.insertionAtMiddle(head,10,15);
    ll.insertionAtMiddle(head,30,35);

    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
    
}