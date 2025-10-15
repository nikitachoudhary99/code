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
    bool searchElement(Node* root,int key);
    Node* insertElement(Node* root,int d);
    void levelOrder(Node *root);
    void buildtree(Node* &root,int d);

};
void Node::buildtree(Node* &root,int d)
{
    Node *temp = new Node;
    temp->data = d;

    if(root==NULL)
    {
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
void Node::levelOrder(Node *root)
{
    if(root==NULL)
    {
        cout<<"No element to be printed"<<endl;
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

        cout<<cur->data<<endl;

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
Node* Node::insertElement(Node* root,int d)
{
    if(root==NULL)
    {
        Node* temp = new Node;
        temp->data = d;
        return temp;
    }
    if(d<=root->data)
    {
        root->left = insertElement(root->left,d);
    }
    else
    {
        root->right = insertElement(root->right,d);
    }
    return root;
}
bool Node::searchElement(Node* root,int key)
{
    Node *cur = root;
    while(cur!=NULL)
    {
        if(cur->data == key)
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
int main()
{
    Node BST;
    Node *root = NULL;

    BST.buildtree(root,50);
    BST.buildtree(root,30);
    BST.buildtree(root,70);
    BST.buildtree(root,40);
    BST.buildtree(root,60);
    BST.buildtree(root,80);
    BST.buildtree(root,10);
    BST.buildtree(root,45);
    
   bool flag = BST.searchElement(root,40);

   flag ? cout<<"Element Found"<<endl : cout<<"Element Not Found"<<endl;

   //flag = BST.searchElement(root,35);

   flag ? cout<<"Element Found"<<endl : cout<<"Element Not Found"<<endl;
}