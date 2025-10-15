#include<iostream>
#include<queue>
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
    void buildTree(Node* &root,int d);
    bool searchElementDFS(Node* root,int key);
    bool searchElementBFS(Node* root,int key);
    void preOrder(Node* root);
    void inOrder(Node* root);
    void postOrder(Node* root);
    void levelOrder(Node *root);
};
bool Node::searchElementBFS(Node* root,int key)
{
    if(root==NULL)
    {
        return false;
    }
    queue<Node*> q;
    q.push(root);

    while(q.empty()!=true)
    {
        Node *cur = q.front();
        q.pop();

        if(cur->data == key)
        {
            return true;
        }
        if(cur->left!=NULL)
        {
            q.push(cur->left);
        }
        if(cur->right!=NULL)
        {
            q.push(cur->right);
        }
        
    }
    return false;
}
void Node::buildTree(Node* &root,int d)
{
    Node *temp = new Node;
    temp->data = d;
    
    if(root==NULL)
    {
        root = temp;
        return;
    }
    else
    {
        queue<Node*> q;
        q.push(root);

        while(q.empty()!=true)
        {
            Node *cur = q.front();
            q.pop();

            if(cur->left==NULL)
            {
                cur->left = temp;
                return;
            }
            else
            {
                q.push(cur->left);
            }

            if(cur->right==NULL)
            {
                cur->right = temp;
                return;
            }
            else
            {
                q.push(cur->right);
            }
        }
    }
}
bool Node::searchElementDFS(Node* root,int key)
{
    if(root==NULL)
    {
        return false;
    }
    if(root->data == key)
    {
        return true;
    }
    bool left = searchElementDFS(root->left,key);
    bool right = searchElementDFS(root->right,key);
    return left || right;
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
void Node::levelOrder(Node *root)
{
    if(root==NULL)
    {
        cout<<"NO element to be printed"<<endl;
        return;
    }
    queue<Node*> q;
    q.push(root);

    while(q.empty()!=true)
    {
        int len = q.size();

        while(len>0)
        {
            Node *cur = q.front();
            q.pop();

            cout<<cur->data<<"\t";

            if(cur->left!=NULL)
            {
                q.push(cur->left);
            }
            if(cur->right!=NULL)
            {
                q.push(cur->right);
            }
            len--;
        }
    }
}
int main()
{
 Node *root = NULL;
 Node BST;
 
 BST.buildTree(root,10);
 BST.buildTree(root,5);
 BST.buildTree(root,8);
 BST.buildTree(root,9);
 BST.buildTree(root,6);
 BST.buildTree(root,19);
 BST.buildTree(root,4);
 BST.buildTree(root,23);
 BST.buildTree(root,27);

 cout<<"Pre Order traversal of the tree"<<endl;
 BST.preOrder(root);

 cout<<endl;
 cout<<"In Order traversal of the tree"<<endl;
 BST.inOrder(root);

 cout<<endl;
 cout<<"Post Order traversal of the tree"<<endl;
 BST.postOrder(root);

 cout<<endl;
 cout<<"level Order traversal of the tree"<<endl;
 BST.levelOrder(root);
 
 int flag = BST.searchElementBFS(root,27);
 //int flag = BST.searchElementDFS(root,89);

 if(flag==true)
 {
    cout<<"Element Found"<<endl;
 }
 else
 {
    cout<<"Element not found"<<endl;
 }

}