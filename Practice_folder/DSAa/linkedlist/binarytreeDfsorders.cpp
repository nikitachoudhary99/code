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
    void preOrder(Node *root);
    void inOrder(Node *root);
    void postOrder(Node *root);
};
void Node::postOrder(Node *root)
{
    if(root==NULL)
    {
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    cout<<root->data<<"\t";
}
void Node::inOrder(Node *root)
{
    if(root==NULL)
    {
        return;
    }
    inOrder(root->left);
    cout<<root->data<<"\t";
    inOrder(root->right);
}
void Node::preOrder(Node *root)
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


    cout<<"pre order travesal of tree"<<endl;
    BT.preOrder(root);


    cout<<endl;
    cout<<"In order traversal of tree"<<endl;
    BT.inOrder(root);

    cout<<endl;
    cout<<"post order traversal of tree"<<endl;
    BT.postOrder(root);
}
