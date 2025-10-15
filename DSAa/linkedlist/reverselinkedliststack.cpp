//reverse linkedlist using stack
#include<iostream>
#include<stack>
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
    void insertionAtHead(Node* &head,int d);
};
void Node::insertionAtHead(Node* &head,int d)
{
    Node *temp = new Node;
    temp->data = d;

    //head exist or not
    if(head==NULL)
    {
        head = temp;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
}
void display(Node* &head)
{
    Node *cur = head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"--->";
        cur = cur->next;
    }
}

//one of the code--->>tc =o(n) sc = o(n)
Node* reverse(Node* &head)
{
    stack<int> st;
    Node* cur = head;

    while(cur!=NULL)
    {
        st.push(cur->data);
        cur = cur->next;
    }
    cur = head;

    while(cur!=NULL)
    {
        cur->data = st.top();
        st.pop();
        cur = cur->next;
    }
    return head;
} 
int main()
{
    Node LL;
    Node *head = NULL;

   LL.insertionAtHead(head,10);
   LL.insertionAtHead(head,20);
   LL.insertionAtHead(head,30);
   LL.insertionAtHead(head,40);
   LL.insertionAtHead(head,50);
   LL.insertionAtHead(head,60);

   cout<<"Before reverse"<<endl;
   display(head);
   
   head = reverse(head);
   cout<<endl;

   cout<<"after reverse"<<endl;
   display(head);
   

     
}