//search middle element in linkedlist
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
int middle(Node* head)
{
    int count = 0;
    Node *cur = head;

    while(cur!=NULL)
    {
        count++;
        cur = cur->next;
    }

    int mid = count/2;

    cur=head;
    if(count%2==0)
    {
        for(int i=1;i<=mid;i++)
        {
            cur = cur->next;
        }
    }
    else
    {
        for(int i=1;i<mid;i++)
        {
            cur = cur->next;
        }
    }
    return cur->data;
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

    int mid = middle(head);
    cout<<"Middle element of the linked list = "<<mid<<endl;
    return 0;
    
}
