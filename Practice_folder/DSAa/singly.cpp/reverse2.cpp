//reverse part 2
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
    void insersionAtHead(Node *&head,int d);
};
void Node::insersionAtHead(Node *&head,int d)
{
    Node *temp = new Node;
    temp->data = d;
    temp->next=head;
    head=temp;
}
void display(Node* &head)
{
    Node* cur=head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"-->";
        cur=cur->next;
    }
}
Node* reverselist(Node* &head)
{
    Node* prev = NULL;
    Node *cur = head;
    Node*temp;
    while(cur!=NULL)
    {
        temp=cur->next;
        cur->next=prev;
        prev=cur;
        cur=temp;
    }
    return prev;
}
int main()
{
    Node LL;
    Node *head = NULL;

    LL.insersionAtHead(head,8);
    LL.insersionAtHead(head,7); 
    LL.insersionAtHead(head,6);
    LL.insersionAtHead(head,5);
    cout<<"before reverse "<<endl;
    display(head);
    head =reverselist(head);
    cout <<endl;
    cout<<"after revrese"<<endl;
    display(head);
    
    



}