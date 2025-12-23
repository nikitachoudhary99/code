//deletion 
#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node()
    {
      next=NULL;
    }
    void insertionAthead(Node* &head, int d);
    void insertionAtMiddle(Node* &head,int d,int newdata);
    void insertionAtTail(Node* &head,int d);
    void deletion(Node* &head,int d);
    void deletionmid(Node* &head,int d);
};
void Node::insertionAthead(Node* &head, int d)
{   Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {    head=temp;
         head->next=head;
        //cout<<"no linked list created"<<endl;
        return;
    }
    else
    {
        temp->next=head;
        Node* cur=head;
        do
        {
            cur=cur->next;
        } while (cur->next!=head);
        
        cur->next=temp;
        head=temp;
    }
}

void Node:: insertionAtMiddle(Node* &head,int d,int newdata)
{   
    if(head==NULL)
    { 
        cout<<"no linked list created "<<endl;
        return;
    }
     Node* temp=new Node;
    temp->data=newdata;
        Node* cur=head;
    do
        {
            if(cur->data==d)
            {
                temp->next=cur->next;
                cur->next=temp;
                return;
            }
            cur=cur->next;
        } while (cur->data!=d && cur->next!=head);

        temp->next=cur->next;
        cur->next=temp;
        
 }

void Node:: insertionAtTail(Node* &head,int d)
{
    Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
        head->next=head;
        return;
    }
    else
    {
        Node* cur=head;
        do
        {
            cur=cur->next;
        } while (cur->next!=head);
        cur->next=temp;
        temp->next=head;
        
    }
}
 void Node::deletion(Node* &head,int d)
 {
    
    Node* temp=new Node;
    temp->data=d;
    if(head->data==d)
    {
      Node* cur=head;
      do
      {
        cur=cur->next;
      } while (cur->next!=head);
      cur->next=head->next;
      //cur->next=cur->next->next;//both r same
      Node* temp=head;
      head=head->next;
      free(temp);
    }
 }
void Node:: deletionmid(Node* &head,int d)
{ Node* temp=new Node;
    temp->data=d;
    Node* cur=head;
    do
    {
       if(cur->next->data==d)
       {
        Node* temp=cur->next;
        cur->next=cur->next->next;
        free(temp);
        return;

       } 
       cur=cur->next;
    } while (cur->next!=head);
    if(cur==head)
    {
        cout<<"no element to be deleted"<<endl;
    }
    

}
int main()
{
    Node* head=NULL;
    Node CLL;
    CLL.insertionAthead(head,2);
    CLL.insertionAthead(head,3);
    CLL.insertionAthead(head,4);
    CLL.insertionAthead(head,6);
       
    CLL.insertionAtMiddle(head,4,5);

    CLL.insertionAtTail(head,10);
    CLL.insertionAtTail(head,20);
    CLL.insertionAtTail(head,30); 
    CLL.insertionAtTail(head,40);

    CLL.insertionAtMiddle(head,10,15);
    CLL.deletion(head,6);

    CLL.deletionmid(head,40);
     CLL.deletionmid(head,30);
    Node* cur=head;
    do
    {
      cout<<cur->data<<"---->";
      cur=cur->next;
    } while (cur!=head);
       
}