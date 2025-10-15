//To create a binary tree using depth first search
#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node *left;
    Node *right;
    Node()
    {
        left = NULL;
        right = NULL;

    }
    Node* createTree();  //using recursion DFS
    void preorder(Node* root);  //DFS
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
Node* Node::createTree()
{
    int d;
    cout<<"Enter data"<<endl;
    cin>>d;

    if(d==-1)
    {
        return NULL;
    }
    Node *root = new Node;
    root->data = d;
    root->left = createTree();
    root->right = createTree();
    return root;
}
int main()
{
    Node BT;
    Node *root = BT.createTree();
    BT.preorder(root);
}