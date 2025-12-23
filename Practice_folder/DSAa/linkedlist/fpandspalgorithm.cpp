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
    void insertAthead(Node* &head,int d);

};
void Node::insertAthead(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;
    if(head==NULL)
    {
        head = temp;
        return;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
}
int getmiddle(Node* head)
{
    if(head==NULL)
    {
        return -1;
    }
    if(head->next==NULL)
    {
        return head->data;
    }
    Node* sp = head;
    Node* fp = head;

    while(fp!=NULL && fp->next!=NULL)
    {
        sp = sp->next;
        fp = fp->next->next;
    }
    return sp->data;
}
int main()
{
    Node *head = NULL;
    Node ll;

    ll.insertAthead(head,10);
    ll.insertAthead(head,20);
    ll.insertAthead(head,30);
    ll.insertAthead(head,40);
    ll.insertAthead(head,50);

    int mid = getmiddle(head);
    cout<<"middle element in linked list "<<mid<<endl;
   
}
