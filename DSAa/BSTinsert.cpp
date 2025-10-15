//insert element in bst
#include<iostream>
using namespace std;
#include<queue>
class Node
{  public:
    int data;
    Node* left;
    Node* right;
    Node()
    {
        left=NULL;
        right=NULL;
    }
    void preorder(Node* root);
    void postorder(Node* root);
    void inorder(Node* root);
    //void buildtree(Node* root,int d);
    Node* insertele(Node* root,int d);
    bool searchele(Node* root,int key);


};
void Node:: preorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}
void Node:: postorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}
void Node:: inorder(Node* root)
{
    if(root==NULL)
    {
        return;
    }
    
        inorder(root->left);
        cout<<root->data<<" ";
        inorder(root->right);
}
// void Node:: buildtree(Node* root,int d)
// {
//     Node* temp=new Node;
//     temp->data=d;
//     if(root==NULL)
//     {
//         root=temp;
//      return;
//     }
//     else
//     {
//       queue<Node*>q;
//       q.push(root);

//       while(q.empty()!=true)
//       {
//         Node* cur=q.front();
//         q.pop();
//         if(cur->left==NULL)
//         {
//             cur->left=temp;
//             return;
//         }
//         else
//         {
//             q.push(cur->left);
//         }
//         if(cur->right==NULL)
//         {
//             cur->right=temp;
//             return;
//         }
//         else
//         {
//             q.push(cur->right);
//         }
//       }
//     }
// }
Node* Node:: insertele(Node* root,int d)
{
    if(root==NULL)
    {
        Node* temp=new Node;
        temp->data=d;
        return temp;
    }
    if(d<=root->data)
    {
        root->left=insertele(root->left,d);
    }
    else
    {
        root->right=insertele(root->right,d);
    }
    return root;
}
  bool Node:: searchele(Node* root,int key)
  {
     Node* cur=root;
     while(cur!=NULL)
     {
     if(cur->data==key)
     {
        return true;
     }
     else if(key<cur->data)
     {
        cur=cur->left;
     }
     else
     {
        cur=cur->right;
     }
  }
  return false;
}
int main()
{
    Node* root=NULL;
    Node bst;
    root=bst.insertele(root,20); 
    root=bst.insertele(root,22);
    root=bst.insertele(root,15);
    root=bst.insertele(root,30); 
    root=bst.insertele(root,35);
    root=bst.insertele(root,40);
    cout<<"preorder traversal"<<endl;
    bst.preorder(root);
    cout<<"postorder traversal"<<endl;
    bst.postorder(root);
    cout<<"inorder traversal"<<endl;
    bst.inorder(root);
  
  bool flag=bst.searchele(root,35);
  flag? cout<<"element found"<<endl:cout<<"element not found"<<endl;
  return 0;
}