//fast and  slow pointer algorthum //tortoise and hare algorithum
#include<iostream>
using namespace std;
class Node
{
    int data;
    Node *next;
    Node()
    {
        next = NULL;
    }
    void insertAtHead(Node*  &head,int d);
    void insertAtMidle(Node* &head,int data);
};
 void Node:: insertAtHead(Node*  &head,int d)
 {
    Node* temp=new Node;
    temp->data=d;
    temp->next=head;
    head=temp;
 }
   void Node:: insertAtMidle(Node* &head,int data,int newdata)
   {
          Node* cur=head;
          while(cur->data!=data && cur->next!=NULL)
          {
            cur=cur->next;
          }
          Node* temp= new Node;
          temp->data=newdata;
          temp->next=cur->next;
          cur->next=temp;
   }
   int middle(Node* head)
   {
     if(head==NULL)
     {
        cout<<"no linked list created "<<endl;
        return -1;
     }
     Node* sp;
     Node* fp;
     while(fp!=NULL && fp->next!=NULL)
     {
        sp=sp->next;
        fp=fp->next->next;
     }
     return sp->data;
   }
   int main()
   {
    Node ll;
    Node* head=NULL;
    ll.insertAtHead(head,20);
    ll.insertAtHead(head,30);
    ll.insertAtHead(head,40);
    ll.insertAtHead(head,50);
    ll.insertAtHead(head,60);
    ll.insertAtHead(head,70);
    ll.insertAtHead(head,80);

    ll.insertAtMidle(head,20,24);
    int mid=middle(head);
    cout<<"middle element of the linked list ="<<mid<<endl;
    return 0;
   }
