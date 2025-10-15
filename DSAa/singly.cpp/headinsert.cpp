//head insertion
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
int main()
{
    Node LL;
    Node *head = NULL;

    LL.insersionAtHead(head,8);
    LL.insersionAtHead(head,7); 
    LL.insersionAtHead(head,6);
    LL.insersionAtHead(head,5);

    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }

}