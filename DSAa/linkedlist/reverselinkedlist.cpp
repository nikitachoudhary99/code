//reverse linkedlist
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
void display(Node* &head)
{
    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
}
Node* reverselist(Node* &head)
{
    Node *prev = NULL;
    Node *cur = head;
    Node *temp;
    while(cur!=NULL)
    {
        temp = cur->next;
        cur->next = prev;
        prev = cur;
        cur = temp;
    }
    return prev;
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
    LL.insertionAtTail(head,60);
    LL.insertionAtTail(head,70);
    LL.insertionAtTail(head,80);
    LL.insertionAtTail(head,90);
    LL.insertionAtTail(head,100);
   
   
    
  cout<<"Before reverse"<<endl;
  display(head);

  head = reverselist(head);
  cout<<endl;

  cout<<"After reverse"<<endl;
  display(head);
} 
   