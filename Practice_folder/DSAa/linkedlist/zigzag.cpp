#include<iostream>
#include<queue>
#include<vector>
using namespace std;
class Node
{
    int data;
    Node *left;
    Node *right;
    Node()
    {
        left = NULL;
        right = NULL;
    }
    void zigzag(Node *root);
};
void Node::zigzag(Node *root)
{
    if(root==NULL)
    {
        cout<<"No element to be printed"<<endl;
        return;
    }

    queue<Node*> q;
    q.push(root);
    bool flag = true;
    while(q.empty()!=true)
    {
        int len = q.size();

        vector<int> v;
        while(len>0)
        {
           Node *cur = q.front();
           q.pop();

           v.push_back(cur->data);

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
        if(flag==true)
        {
            for(int i=0;i<v.size();i++)
            {
                cout<<v[i]<<"\t";
            }
            flag = false;
        }
        else
        {
            for(int i=v.size()-1;i>=0;i--)
            {
                cout<<v[i]<<"\t";
            }
            flag = true;
        }
        cout<<endl;

    }
}
int main()
{
    
}