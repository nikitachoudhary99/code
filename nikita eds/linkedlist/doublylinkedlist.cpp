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
    void insertionAtHead(Node* &head,int d);
    void insertionAtTail(Node* &head,int d);
    void insertionAtmiddle(Node* &head,int d,int newdata);
};
void Node::insertionAtmiddle(Node* &head,int d,int newdata)
{
    if(head==NULL)
    {
        cout<<"No list has been created yet"<<endl;
        return;
    }
    Node*  cur = head;
    while(cur->data!=d && cur->next!= NULL)
    {
        cur = cur->next;
    }
    Node *temp = new Node;
    temp->data = newdata;
    if(cur->next==NULL)
    {
        cur->next = temp;
        temp->prev = cur;
    }
    else
    {
        temp->prev = cur;
        temp->next = cur->next;
        cur->next->prev = temp;
        cur->next = temp;
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

    //firts check for starting of list
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
    DLL.insertionAtmiddle(head,10,5);
    DLL.insertionAtHead(head,10); 
    DLL.insertionAtHead(head,20);
    DLL.insertionAtHead(head,30);
    DLL.insertionAtHead(head,40);
    DLL.insertionAtHead(head,50);
    DLL.insertionAtHead(head,60);

    DLL.insertionAtmiddle(head,20,15);

    DLL.insertionAtTail(head,5);
    DLL.insertionAtTail(head,8);

    DLL.insertionAtmiddle(head,5,3);

    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"-->";
        cur = cur->next;
    }
   cout<<endl;

   cout<<"Printing in reverse order"<<endl;
   cur = head;

   while(cur->next!=NULL)
 {
    cur = cur->next;
 } 
   
   while(cur!=NULL)
   {
    cout<<cur->data<<"--->";
    cur = cur->prev;
   }
}