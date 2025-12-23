// tail insertion
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
   
};
void Node::insertionAtTail(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;

    //check head exist or not
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
int main()
{
    Node LL;

    Node *head = NULL;

    LL.insertionAtTail(head,10);
    LL.insertionAtTail(head,20);
    LL.insertionAtTail(head,30);
    LL.insertionAtTail(head,40);
    LL.insertionAtTail(head,50);

    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
}