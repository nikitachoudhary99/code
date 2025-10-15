//deletion of doubly link list
#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node* prev;
    Node* next;
    Node()
    { 
        prev=NULL;
        next=NULL;
    }
    void insertAtHead(Node* &head,int d);
    void deletion(Node* &head,int d);
};
void Node:: insertAtHead(Node* &head,int d)
{
 Node* temp=new Node;
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
 void Node::deletion(Node* &head,int d)

{  //step 1
    //head deletion
    if(head->data==d)
    {
        Node* temp=head;
        head=head->next;
        head->prev=NULL;
        free(temp);
        return;
    }
    else
    {   //step 2
        //deletion at middile
        Node* cur=head;
        while(cur!=NULL && cur->data!=d)
        {
            cur=cur->next;
            if(cur!=NULL)
            {
                if(cur->next!=NULL)
                {
                    cur->prev->next=cur->next;
                    cur->next->prev=cur->prev;
                    free(cur);
                    return;
                }
                else if( cur->next==NULL)
                {
                    cur->prev->next==NULL;
                    free(cur);
                    return;
                }
            }
        
         else
        {
            cout<<"no element placed hear"<<endl;
            return;
            
        }

    }
    

    }
}
int main()
{  
    Node* head=NULL;
    Node ll;
    ll.insertAtHead(head,10);
    ll.insertAtHead(head,20);
    ll.insertAtHead(head,30);
    ll.insertAtHead(head,40);
    ll.insertAtHead(head,50);
    ll.deletion(head,20);
    Node*cur=head;
    while(cur!=NULL)
    {
    cout<<cur->data<<"\t";
    cur=cur->next;}
    
} 