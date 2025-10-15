//deletion 
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
    void insertAtHead(Node* &head,int d);
    void insertAtdelete(Node* &head ,int x);
};
void Node:: insertAtHead(Node* &head, int d)
{
    Node* temp=new Node;
    temp->data=d;
    temp->next=head;
    head=temp;
}
    void Node:: insertAtdelete(Node* &head ,int x)
    {
        if(head==NULL)
        {
            cout<<"no linked list created ever"<<endl;
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
//   int main()
//   {
//     Node ll;
//     Node* head=NULL;
//     ll.insertAtHead(head,10);
//     ll.insertAtHead(head,20);
//     ll.insertAtHead(head,30);
//     ll.insertAtHead(head,40);

//     ll.insertAtdelete(head,20);  

//     Node* cur=head;
//     while(cur!=NULL)
//     {
//         cout<<cur->data<<"-->";
//         cur=cur->next;

//     }
//     cout<<"NULL"<<endl;
//   }