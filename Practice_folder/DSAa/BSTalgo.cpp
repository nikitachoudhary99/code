//binary search tree
#include<iostream>
#include<queue>
using namespace std;
class Node
{
    public:
    int data;
    Node* left;
    Node* right;
    Node()
    {
        left=NULL;
        right=NULL;
    }
    void buildtree(Node* &root,int d);
    void preorder(Node* root);
    void inorder(Node* root);
    void postorder(Node* root);
    void levelorder(Node* root);
    bool searchEleBFS(Node* root,int key);
    bool searchEleDFS(Node* root,int key);
};
void Node:: buildtree(Node* &root,int d)
{  
    Node* temp=new Node;  
    temp->data=d;

    if(root==NULL)
    {
       root=temp;
       return;
       
    }
    else
    {
        queue<Node*>q;
        q.push(root);
        while(q.empty()!=true)
        {
            Node* cur=q.front();
            q.pop();
            if(cur->left==NULL)
            {
                cur->left=temp;
                return;
            }
            else
            {
                q.push(cur->left);
            }
            if(cur->right==NULL)
            {
                cur->right=temp;
                return;
            }
            else
            {
                q.push(cur->right);
            }
        }
    }
}
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
void Node:: inorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    inorder(root->left);
    cout<<root->data<<"\t";
    inorder(root->right);
}
void Node::postorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<"\t";
}
void Node::levelorder(Node* root)
{
    if(root==NULL)
    {
        cout<<"no element placed hear"<<endl;
        return;
    }
    else
    {
        queue<Node*>q;
        q.push(root);
        while(q.empty()!=true)
        {
            int len=q.size();

            while(len>0)
            {
                Node* cur=q.front();
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
}
bool searchEleDFS(Node* root,int key)
{ 
    if(root==NULL)
    {
        return false;
    }
    if(root->data==key)
    {
        return true;
    }
    bool left=searchEleDFS(root->left,key);
    bool right=searchEleDFS(root->right,key);
    return right||left;
}
bool Node::searchEleBFS(Node* root,int key)
{
    if(root==NULL)
    {
        return false;}
        queue<Node*>q;
        q.push(root);
        while(q.empty()!=true)
        {
            Node* cur=q.front();
            q.pop();
            if(cur->data==key)
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
int main()
{
    Node* root=NULL;
    Node bt;
    bt.buildtree(root,50);
    bt.buildtree(root,40);
    bt.buildtree(root,65);
    bt.buildtree(root,35);
    bt.buildtree(root,45); 
    bt.buildtree(root,70);
    bt.buildtree(root,100);
    bt.buildtree(root,75);
    cout<<"pre order traversal"<<endl;
    bt.preorder(root);
    cout<<"post order traversal"<<endl;
    bt.postorder(root);
    cout<<"in order traversal"<<endl;
    bt.inorder(root);
    cout<<endl;
    cout<<"level order traversal"<<endl;
    bt.levelorder(root);
    int flag=bt.searchEleBFS(root,45);
    if(flag==true)
    {
        cout<<"element found"<<endl;
    }  
    else
    {
        cout<<"element not found"<<endl;
    } 
    // int flag=bt.searchEleDFS(root,100);
    // if(flag==true)
    // {
    //     cout<<"element found"<<endl;
    // }  
    // else
    // {
    //     cout<<"element not found"<<endl;
    // }
}