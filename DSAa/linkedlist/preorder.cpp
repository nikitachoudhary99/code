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
    Node* createTree();
    void preOrder(Node* root);
};
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
Node* Node::createTree()
{
    int d;
    cout<<"Enter the data"<<endl;
    cin>>d;
    if(d==-1)
    {
        return NULL;
    }
    Node *root = new Node;
    root->data = d;
    root->left = createTree();
    root->right = createTree();
}
int main()
{
    Node BT;
    Node *root = BT.createTree();

    cout<<"Pre Order traversal of the tree"<<endl;
    BT.preOrder(root);
}