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
    void inorder(Node* root);
    void createtree(Node* root,int d);
    bool searchele(Node* root,int key);
    int presesor(Node* root);
    int successer(Node* root);
    Node* deleteNode(Node* root,int key);
};
void Node:: inorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    inorder(root->left);
    cout<<root->data<<"\t";
    inorder(root->right);
}
void Node:: createtree(Node* root,int d)
{
    if(root==NULL)
    {
        Node*  temp=new Node;
        temp->data=d;
        return temp;
        if(d<root->data)
        {
            root->left=createtree(root->left,d);
        }
        else
        {
            root->right=createtree(root->right,d);
        }
       return root;
    }
}
int Node::presesor(Node* root)
{
    if(root==NULL)
    {
        return -1;
    }
    Node* cur=root->left;
    if(root->left!=NULL)
    {
        while(cur->right!=NULL)
        {
            return cur->data;
        }
    }
}
int Node:: successer(Node* root)
{

}
bool Node:: searchele(Node* root,int key)
{

}
Node* Node::deleteNode(Node* root,int key)
{

}
int main()
{

}