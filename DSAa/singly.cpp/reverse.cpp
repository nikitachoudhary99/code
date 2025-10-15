//reverse linklist using stack
#include<iostream>
#include<stack>
#include"delet.cpp"
using namespace std;
void display(Node* &head)
{
    Node* cur=head;
    while(cur!=NULL)
    {
        cout<<cur->data<<"---->";
        cur=cur->next;
    }
}
Node* reverse(Node* &head)
{
    stack<int>st;
    Node*cur=head;
    while(cur!=NULL)
    {
        st.push(cur->data);
        cur=cur->next;
    }
    cur=head;
    while (cur!=NULL)
    {
       cur->data=st.top();
       st.pop();
       cur=cur->next;
    }
    return head;
    
}
int main()
{
    Node ll;
    Node* head=NULL;
    ll.insertAtHead(head,10);
    ll.insertAtHead(head,20);
    ll.insertAtHead(head,30);
    ll.insertAtHead(head,40);
    ll.insertAtHead(head,50);
    ll.insertAtHead(head,60);
    
    cout<<"before reverse"<<endl;
    display(head);
    cout<<endl;

    head=reverse(head);
    cout<<endl;

    cout<<"after reverse"<<endl;
    display(head);
    cout<<endl;

        


 



    


}
