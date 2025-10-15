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
    void levelOrder(Node* root);
};
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
void Node::buildTree(Node* &root,int d)
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
int main()
{
    Node *root = NULL;
    Node BST;
}