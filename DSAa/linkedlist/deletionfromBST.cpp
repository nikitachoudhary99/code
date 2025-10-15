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
    Node* createBST(Node *root,int d);
    void inOrder(Node *root);
    bool searchElement(Node* root,int key);
    int successor(Node *root);
    Node* deletionfromBST(Node *root,int key);

};
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
bool Node::searchElement(Node* root,int key)
{
    Node* cur = root;
    while(cur!=NULL)
    {
        if(cur->data==key)
        {
            return true;
        }
        else if(key<cur->data)
        {
            cur = cur->left;
        }
        else
        {
            cur = cur->right;
        }
    }
    return false;
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
    }
    return cur->data;
}
Node* Node::deletionfromBST(Node* root,int key)
{
    if(root->data==key)
    {
        
        //deletion
        //case 1->> Node to be deleted have no child;
        if(root->left==NULL && root->right==NULL)
        {
            free(root);
            return NULL;
        }

        //case 2 ->> only 1 child left not present but right present
        if(root->left==NULL && root->right!=NULL)
        {
            Node *temp = root->right;
            free(root);
            return temp;
        }

        //root->left present but root->right not present;
        if(root->left!=NULL && root->right==NULL)
        {
            Node *temp = root->left;
            free(root);
            return temp;
        }

        //case 3 ->>when both child present
        if(root->left!=NULL && root->right!=NULL)
        {
            int min = successor(root);
            root->data = min;
            root->right = deletionfromBST(root->right,min);
        }
    }
    else if(key<root->data)
    {
        root->left = deletionfromBST(root->left,key);
    }
    else
    {
        root->right = deletionfromBST(root->right,key);
    }
    return root;
}
int main()
{
    Node *root = NULL;
    Node BST;
    root = BST.createBST(root,50);
    root = BST.createBST(root,30);
    root = BST.createBST(root,70);
    root = BST.createBST(root,40);
    root = BST.createBST(root,60);
    root = BST.createBST(root,80);
    root = BST.createBST(root,10);
    root = BST.createBST(root,45);
    root = BST.createBST(root,42);

    root = BST.deletionfromBST(root,30);
    BST.inOrder(root);
    
}