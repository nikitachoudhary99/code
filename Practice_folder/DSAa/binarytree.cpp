//depth wise tree 
//recurtion
//to cheack a binary tree
#include<iostream>
using namespace std;  
class Node
{
    public:
    int data;
    Node* left;
    Node* right;
    Node()
    {
        left=NULL;
        right=NULL;
    }
    Node* createtree();
    void preorder(Node* root);
}; 
void Node::preorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    cout<<root->data<<"\t";
    preorder(root->left);
    preorder(root->right);
}
Node* Node:: createtree()
{
  int d;
  cout<<"enter the data"<<endl;
  cin>>d;
  if(d==-1)
  {
    return NULL;
  }
  Node* root=new Node;
  root->data=d;
  root->left=createtree();
  root->right=createtree();
  return root;
}
int main()
{
   Node bt;
   Node* root=bt.createtree();
   bt.preorder(root);
}