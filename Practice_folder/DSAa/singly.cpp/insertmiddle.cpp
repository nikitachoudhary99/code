// insertion at middle
#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    
    Node *next;
    Node()
    {
    next= NULL;
    }

  void insertAtMiddle(Node* &head,int data,int newdata);
  void insertAthead(Node* &head ,int d);
};
void Node::insertAthead(Node* &head ,int d)
{
  Node* temp=new Node;
  temp->data=d;
  temp->next=head;
  head=temp;

}
void Node:: insertAtMiddle(Node* &head,int data,int newdata)
{
   Node* cur=head;
    while(cur->data!=data && cur->next!=NULL)
    {
        cur=cur->next;
    }
    Node* temp=new Node;
    temp->data=newdata;
    temp->next=cur->next;
    cur->next=temp;

}
int main()
{
  Node ll;
  Node* head=NULL;

  ll.insertAthead(head,10);
  ll.insertAthead(head,20);
  ll.insertAthead(head,30);

    ll.insertAtMiddle(head,20,25);
  Node* cur=head;
  while(cur!=NULL)
  {
    cout<<cur->data<<"---->";
    cur=cur->next;
  }
  cout<<"NULL"<<endl;
  
  
}