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
    void postOrder(Node* root);
};
void Node::postOrder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    cout<<root->data<<"\t";
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

    cout<<"post order traversal of the tree"<<endl;
    BT.postOrder(root);
}