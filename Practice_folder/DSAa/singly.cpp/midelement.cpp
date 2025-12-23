//fast and  slow pointer algorthum //tortoise and hare algorithum
#include<iostream>
using namespace std;
class Node
{  public:
    int data;
    Node *next;
    Node()
    {
        next = NULL;
    }
    void insertAtHead(Node*  &head,int data);
    void insertAtMidle(Node* &head,int data,int newdata);
};
 void Node:: insertAtHead(Node*  &head,int data)
 {
    Node* temp=new Node;
    temp->data=data;
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
   int middle(Node* &head)
   {
       int count=0;
        Node* cur=head;

        while(cur!=NULL)
        {
            count++;
            cur=cur->next;
        }
        int mid=count/2;
        cur=head;
        if(count%2==0)
        {
            for(int i=0;i<mid;i++)
            {
                cur=cur->next;
            }
        }
        else
        
            
            for(int i=1;i<mid;i++)
            {
                cur=cur->next;              
            }
        
        return cur->data;
    
     if(head==NULL)
     {
        cout<<"no linked list created "<<endl;
        return -1;
     }
     Node* sp=head;
     Node* fp=head;
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
    ll.insertAtHead(head,10);
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
