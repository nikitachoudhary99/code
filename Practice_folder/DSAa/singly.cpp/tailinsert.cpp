//tail insertion in linklist
#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node *next;
    Node()
      {
        next=NULL;
      }
    void insertAtTail(Node* &head,int d);

};
void Node::insertAtTail(Node* &head,int d)
{
    Node *temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
    }
    else
    {
         Node *cur=head;
         while(cur->next!=NULL)
         {
            cur=cur->next;
         }
         cur->next=temp;
    }
}
int main()
{
    Node LL;
    Node *head=NULL;
    LL.insertAtTail(head,10);
    LL.insertAtTail(head,20);
    LL.insertAtTail(head,30);
    LL.insertAtTail(head,40);
    LL.insertAtTail(head,50);
    Node *cur=head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->>";
        cur=cur->next;
    }
}