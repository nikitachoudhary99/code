// doubly link list 
/* insertion head,tail,middl
    deletion
*/
#include<iostrem>
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
    void insertionathead(Node* &head,int d);
    void insertionattail(Node* &head,int d);
    void insertionatmiddle(Node* &head,int d,int newdata);
    void deletion(Node* &head,int x);
    void display(Node* &head);
    void displayreverse(Node* &head);
};
void Node:: insertionathead(Node* &head,int d)
{
    Node* temp= new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
        temp->next=head;
        temp->prev=head;
    }
    else
    {
        temp->next=head;
        temp->prev=head->prev;
        head->prev->next=temp;
        head->prev=temp;
        head=temp;
    }
}
void Node::insertionattail(Node* &head,int d)
{
    Node* newnode=new  Node;
    
}