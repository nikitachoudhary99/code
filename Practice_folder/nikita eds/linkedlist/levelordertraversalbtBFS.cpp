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
    void buildTree(Node* &root,int d); //using BFS
    void preOrder(Node *root);
    void inOrder(Node *root);
    void postOrder(Node *root);
};
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
int main()
{
    Node BT;
    Node *root = NULL;

    while(true)
    {
        cout<<"press 1 to insert data"<<endl;
        cout<<"press 2 if done"<<endl;

        int n;
        cin>>n;

        if(n==1)
        {
            int d;
            cout<<"enter the data"<<endl;
            cin>>d;

            BT.buildTree(root,d);
        }
        else if(n==2)
        {
            break;
        }
    }

    cout<<"pre order traversal of the tree"<<endl;
    BT.preOrder(root);

    cout<<endl;
    cout<<"post Oredr traversal of the tree"<<endl;
    BT.inOrder(root);

    cout<<endl;
    cout<<"post order traversal of the tree"<<endl;
    BT.postOrder(root);
}