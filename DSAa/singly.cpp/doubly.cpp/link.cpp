// insertion ,deletion,middle ,head ,tail,,reverse
#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node* next;
    Node* prev;
    Node()
    {   prev=NULL;
        next=NULL;
    }
    void insertAthead(Node* &head,int d);
    void insertAttail(Node* &head,int d);
    void insertAtmiddle(Node* &head,int d,int newdata);

};
 void Node:: insertAthead(Node* &head,int d)
 {  Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
        return;
    }
    else{
     temp->next = head;
        head->prev = temp;
        head = temp;
    }
 }
 void Node::insertAttail(Node* &head,int d)
 {
    Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
        return;
    }
    else
    {  
        Node* cur=head;
        while(cur->next!=NULL)
        {
            Node* temp=cur->next;
            cur=cur->next;
        } 
      cur->next=temp;
      cur->prev=cur;
    }
 }
void Node:: insertAtmiddle(Node* &head,int d,int newdata)
{
    if(head==NULL)
    {
        cout<<"no linklist created"<<endl;
        return; 
    }
    Node* cur=head;
    while(cur->data!=data && cur->next!=NULL)
    {
        cur=cur->next;
    }
    Node*temp=new Node;
    temp->data=newdata;
    if(cur->next==NULL)
    {
        cur->next=temp;
        temp->prev=cur;
    }
    else
    {
        temp->prev=cur;
        temp->next=cur->next;
        cur->next->prev=temp;
        cur->next=temp;
    }
}
int main()
{
    Node* head=NULL;
    Node DLL;
    DLL.insertAtmiddle(head,10,120);

    DLL.insertAthead(head,10);
    DLL.insertAthead(head,20);
    DLL.insertAthead(head,30);
    DLL.insertAthead(head,40);
    DLL.insertAthead(head,50);

    DLL.insertAtmiddle(head,20,25);
     DLL.insertAtmiddle(head,20,235); 
     DLL.insertAtmiddle(head,20,55);

     DLL.insertAttail(head,100);
     DLL.insertAttail(head,200);
     Node* cur=head;
     while(cur!=NULL)
     {
      cout<<cur->data<<"-->";
      cur=cur->next;
     }
     cout<<endl;
     cout<<"printing in reverse order"<<endl;
     cur=head;
     while(cur->next!=NULL)
     {
        cur=cur->next;
     }
     while(cur!=NULL)
     {
        cout<<cur->data<<" -->";
        cur=cur->prev;
     }
}

