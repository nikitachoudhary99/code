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
Node* deleteNode(Node* head,int x)
{
    if(head==NULL)
    {
        return head;
    }
    if(x==1)
    {
        Node *temp = head;
        head = head->next;
        free(temp);
        return head;
    }
    Node *cur = head;
    int i = 1;
    while(cur->next!=NULL && i<x-1)
    {
        cur = cur->next;
        i++;
    }
    cur->next = cur->next->next;
    return head;
}
};
int main()
{
    Node ll;
    Node *head = NULL;
    
}

