//level order traversal
//BFS algorithum
//level order   //level order algorithum
#include<iostream>
#include<queue>
using namespace std;
class Node
{
    public:
    int data;
    Node* left;
    Node* right;
    Node* cur;

    Node()
    {
        left=NULL;
        right=NULL;
    }
    void buildTree(Node* &root ,int d);
    void preOrder(Node* root);
    void inOrder(Node* root);
    void postOrder(Node* root);
    void levelOrder(Node* root);
    
};
void Node::levelOrder(Node* root)
{
    if(root==NULL)
    {
        cout<<"no element to be printed"<<endl;
        return;
    }
    queue<Node*>q;
    q.push(root);
    while(q.empty()!=true)
    {
        int len=q.size();
        while(len>0)
        {
            Node* cur=q.front();
            q.pop();
            cout<<cur->data<<endl;
            if(cur->left!=NULL)
            {
                q.push(cur->left);
            }
            if(cur->right==NULL)
            {
                q.push(cur->right);
            }
            len--;
        }
    }
}
void Node:: buildTree(Node* &root,int d)
{
    Node* temp=new Node;
    temp->data=d;
    if(root==NULL)
    {
        root=temp;
        return;
    }
    else
    {
        queue<Node*>q;
        q.push(root);
    
    while(q.empty()!=true)
    {
      if(cur->left==NULL)
      {
        cur->left=temp;
        return;
      }
      else
      {
        q.push(cur->left);
      }
      if(cur->right==NULL)
      {
         cur->right=temp;
        return;
      }
      else
      {
        q.push(cur->right);
      }
      
    }
 }
}
void Node::preOrder(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        cout<<root->data<<"\t";
        preOrder(root->left);
        preOrder(root->right);
    }
    void Node:: inOrder(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        inOrder(root->left);
        cout<<root->data<<"\t";
        inOrder(root->right);
    }
    void Node:: postOrder(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        postOrder(root->left);
        postOrder(root->right);
        cout<<root->data<<"\t";
    }
int main()
{
    Node* root=NULL;
    Node bt;
    while(true)
    {
        cout<<"press 1 to insert data"<<endl;
        cout<<"press 2 to exit"<<endl;
        int n;
        cin>>n;
        if(n==1)
        {
            int d;
            cout<<"enter the data "<<"\t";
            cin>>d;
            bt.buildTree(root,d);
        }
        else
        {
            if(n==2)
            {
                break;
            }
        cout<<"pre order traversal of the tree"<<endl;
        bt.preOrder(root);
        cout<<endl;

        cout<<"in order traversal of the tree"<<endl;
        bt.inOrder(root);
        cout<<endl;

        cout<<"post order traversal of the tree"<<endl;
        bt.postOrder(root);
        cout<<endl;
        }
    }
}