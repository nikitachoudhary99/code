//doubly  circular 
#include<iostream>
using namespace std;
   class Node
   { 
    public:
    int data;
    Node* prev;
    Node* next;
    Node()
    { 
        prev=NULL;
        next=NULL;
    }
    void insertAtHead(Node* &head,int d);
    void deletion(Node* &head,int d);
    void display(Node* head);
    void displayReverse(Node* head);
     
};

void Node::displayReverse(Node* head)
{
   if(head==NULL)
   {
    cout<<"no link list created"<<endl;
    return;
   }
   Node* cur=head;
   while(cur->next!=head)
   {
    cur=cur->next;
   }
   //traverse
   do
   {
     cout<<cur->data<<"--->";
     cur=cur->prev;
   } while (cur!=head);
   cout<<endl;
   
}
void Node:: display(Node* head)
{
    if(head==NULL)
    {
        cout<<"no link list created"<<endl;
        return;
    }
    Node* cur=head;
    do
    {
        cout<<cur->data<<"--->";
        cur=cur->next;
    } while (cur!=head);
    cout<<endl;
    
}
void Node:: insertAtHead(Node* &head,int d)
{
 Node* temp=new Node;
    temp->data=d;
    if(head==NULL)
    {
        head=temp;
        temp->next=head;
        temp->prev=head;
        
    }
    else{
        temp->next = head;
        temp->prev=head->prev;
        head->prev->next = temp;
        head->prev=temp;
        head = temp;
    }
}
 void Node::deletion(Node* &head,int d)

{  //step 1
    //head deletion
    if(head==NULL)
    {
        cout<<"no linklist created"<<endl;
        return;
    }
    Node* cur=head;
    if(head->data==d)
    { if(head->next==head)
    {
        if(head->next==head)
         {
            delete head;
            head=NULL;
            return;

        }
        else
        {
            Node* temp=head;
            head=head->next;
            head->prev=temp->prev;
            temp->prev->next=head;
            delete temp;
            return;
        }
    }
    else
    {   
       cur = head->next;
    while (cur != head) {
        if (cur->data == d) {
            cur->prev->next = cur->next;
            cur->next->prev = cur->prev;
            delete cur;
            return;
        }
        cur = cur->next;
    }

    cout << "Element " << d << " not found in the list" << endl; 
    }
}
}
int main()
{
     Node* head=NULL;
    Node DLL;
    //DLL.insertAtmiddle(head,10,120);

    DLL.insertAtHead(head,10);
    DLL.insertAtHead(head,20);
    DLL.insertAtHead(head,30);
    DLL.insertAtHead(head,40);
    DLL.insertAtHead(head,50);

    
     
    
    cout << "Circular Doubly Linked List in forward direction:" << endl;
    DLL.display(head);


    cout << "Circular Doubly Linked List in reverse direction:" << endl;
    DLL.displayReverse(head);

    
    cout << "Deleting node with value 30:" << endl;
    DLL.deletion(head, 30);
    DLL.display(head);
    
    
    cout << "Deleting node with value 100:" << endl;
    DLL.deletion(head, 100);
    DLL.display(head);

    return 0;
}

