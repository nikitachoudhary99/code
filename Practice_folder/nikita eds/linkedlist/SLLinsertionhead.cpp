
//head insertion 
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
};
void Node::insertionAtHead(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;

    //head exist or not
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

    ll.insertionAtHead(head,5);
    ll.insertionAtHead(head,10);
    ll.insertionAtHead(head,15);

    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
   
}