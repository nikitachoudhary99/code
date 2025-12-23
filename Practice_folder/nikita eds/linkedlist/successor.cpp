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
    void inOrder(Node* root);
    bool searchElement(Node *root,int key);
    Node* createBST(Node *root,int d);
    int successor(Node* root);

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
bool Node::searchElement(Node *root,int key)
{
    Node *cur = root;
    while(cur!=NULL)
    {
        if(cur->data==key)
        {
            return true;
        }
        else if(key<cur->data)
        {
            cur =  cur->left;
        }
        else
        {
            cur =  cur->right;
        }
    }
}
Node* Node::createBST(Node *root,int d)
{
    if(root==NULL)
    {
        Node* temp = new Node;
        temp->data = d;
        return temp;
    }

    if(d<=root->data)
    {
        root->left = createBST(root->left,d);
    }
    else
    {
        root->right = createBST(root->right,d);
    }
    return root;
}

int Node::successor(Node *root)
{
    if(root==NULL)
    {
        return -1;
    }
    Node *cur = root->right;
    if(root->right!=NULL)
    {
        while(cur->left!=NULL)
        {
            cur = cur->left;
        }
        return cur->data;
    }
}
int main()
{
    Node* root = NULL;
    Node BST;

    root = BST.createBST(root,50);
    root = BST.createBST(root,35);
    root = BST.createBST(root,70);
    root = BST.createBST(root,32);
    root = BST.createBST(root,45);
    root = BST.createBST(root,65);
    root = BST.createBST(root,80);
    root = BST.createBST(root,30);
    root = BST.createBST(root,37);
    root = BST.createBST(root,48);
    //root = BST.createBST(root,37);

    int min = BST.successor(root->left);
    cout<<"Minimum data in the root->right"<<min<<endl;

    BST.inOrder(root);
}