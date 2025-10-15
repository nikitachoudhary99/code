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
    void insertionAthead(Node* &head,int d);
    void insertionAtTail(Node* &head,int d);
};
void Node::insertionAthead(Node* &head,int d)
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
void Node::insertionAtTail(Node* &head,int d)
{

}
int main()
{
    Node *temp = NULL;
    Node DCL;

}