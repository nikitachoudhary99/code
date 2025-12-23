//singly link list 1->insertion->1>head,2>tail,3>middle     2->delete node
#include<iostream>
using namespace std;
class Node
{
  public:
  int data;
  Node* next;
  Node()
  {
    next=NULL;
  }
  void insertionatHead(Node* &head,int d);
  void insertionatTail(Node* &head,int d);
  void insertionatMiddle(Node* &head,int d,int newdata);
  void deleteNode(Node* &head,int x);
};
void Node::insertionatHead(Node* &head,int d)
{
    Node* temp=new Node;
    temp->data=d;
    temp->next=head;
    head=temp;
}
void Node::insertionatTail(Node* &head,int d)
{
    Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
    }
    else
    {
      Node* cur=head;
      while(cur->next!=NULL)
      {
        cur=cur->next;
      }
      cur->next=temp;
    }
}
void Node::insertionatMiddle(Node* &head,int d,int newdata)
{
    Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
    }
    else
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
}
void Node::deleteNode(Node* &head,int x)
{
    if(head==NULL)
    {
        cout<<"no link list created"<<endl;
        return;
    }
    if(head->data==x)
    {
        Node* temp=head;
        head=head->next;
        delete temp;
        return;
    }
    Node* cur=head;
    while(cur->next!=NULL && cur->next->data!=x)
    {
        cur=cur->next;
    }
    if(cur->next==NULL)
    {
        cout<<"no link list created"<<endl;
        return;
    }
    else
    {
        Node* temp=cur->next;
        cur->next=cur->next->next;
        delete temp;
    }
}
int main()
{
    Node n;
    Node* head=NULL;
    n.insertionatHead(head,10);
    n.insertionatHead(head,20);
    n.insertionatTail(head,40);
    n.insertionatTail(head,50);
    n.insertionatMiddle(head,30,35);
    n.deleteNode(head,30);
    Node* cur=head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"---> ";
        cur=cur->next;
    }
    cout<<"NULL"<<endl;

}

