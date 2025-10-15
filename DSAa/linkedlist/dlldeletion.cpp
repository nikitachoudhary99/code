#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node *next;
    Node *prev;
    Node()
    {
        next = NULL;
        prev = NULL;
    }
    void insertionAtTail(Node* &head,int d);
    void insertionAtHead(Node* &head,int d);
    void deletion(Node* &head,int d);
};
void Node::deletion(Node* &head,int d)
{
    if(head->data == d)
    {
        //to checkhead element to be deleted
        Node* temp = head;
        head = head->next;
        head->prev = NULL;
        free(temp);
        return;
    }
    //if it is middle element or last element
    Node *cur = head;

    //place cur to correct position
    while(cur!=NULL && cur->data!=d)
    {
        cur = cur->next;
    }
    if(cur!=NULL)
    {
        if(cur->next!=NULL)
        {
            cur->prev->next = cur->next;
            cur->next->prev = cur->prev;
            free(cur);
            return;
        }
        else if(cur->next==NULL)
        {
            cur->prev->next = NULL;
            free(cur);
            return;
        }
    }
    else
    {
        cout<<"No element to be deleted"<<endl;
        return;
    }
}
void Node::insertionAtTail(Node* &head,int d)
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
        Node *cur = head;
        while(cur->next!=NULL)
        {
            cur = cur->next;
        }
        cur->next = temp;
        temp->prev = cur;
    }
}
void Node::insertionAtHead(Node* &head,int d)
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
        head->prev = temp;
        head = head->prev;
    }
}
int main()
{
  Node *head = NULL;
  Node DLL;

    DLL.insertionAtHead(head,15);
    DLL.insertionAtHead(head,20);
    DLL.insertionAtHead(head,30);
    DLL.insertionAtHead(head,40);

    DLL.insertionAtTail(head,5);
    DLL.insertionAtTail(head,8);
    DLL.insertionAtTail(head,10);
    DLL.insertionAtTail(head,12);
 
    DLL.deletion(head,15);
 

  Node *cur = head;
  while(cur!=NULL)
  {
    cout<<cur->data<<"--->";
    cur = cur->next;
  }
  cout<<endl;
 
  
}