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
    void inOrder(Node* root);
};
void Node::inOrder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    inOrder(root->left);
    cout<<root->data<<"\t";
    inOrder(root->right);
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

    cout<<"In order traversal in Binary tree "<<endl;
    BT.inOrder(root);

}