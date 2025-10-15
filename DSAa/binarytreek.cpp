    //binary tree pre,post,in order
    #include<iostream>
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
        void preOrder(Node* root);
        void InOrder(Node* root);
        void PostOrder(Node* root);
        Node* createtree();
    };
    Node* Node::createtree()
    {
        int d;
        cout<<"enter the value of d\n"<<endl;
        cin>>d;
        if(d==-1)
        {
            return NULL;
        }
        Node* root=new Node;
        root->data=d;
        root->left=createtree();
        root->right=createtree();
        return root;
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
    void Node:: InOrder(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        InOrder(root->left);
        cout<<root->data<<"\t";
        InOrder(root->right);
    }
    void Node:: PostOrder(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        PostOrder(root->left);
        PostOrder(root->right);
        cout<<root->data<<"\t";
    }
    int main()
    {
        Node bt;
        Node *root=bt.createtree();

        cout<<"pre order traversal of the tree"<<endl;
        bt.preOrder(root);
        cout<<endl;

        cout<<"in order traversal of the tree"<<endl;
        bt.InOrder(root);
        cout<<endl;

        cout<<"post order traversal of the tree"<<endl;
        bt.PostOrder(root);
        cout<<endl;

    }
/*
              10
         20       30
    18      19 40    50  

pre order traversal of the tree
10      20      18      19      30      40      50
in order traversal of the tree
18      20      19      10      40      30      50
post order traversal of the tree
18      19      20      40      50      30      10

*/