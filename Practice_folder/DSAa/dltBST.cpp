#include<iostream>
using namespace std;

class Node {
public:
    int data;
    Node* left;
    Node* right;
    
    Node() {
        left = NULL;
        right = NULL;
    }
    
    Node* createBst(Node* root, int d);
    void inorder(Node* root);
    bool searchElement(Node* root, int key);
    int predecessor(Node* root);
    int successor(Node* root);
    Node* deleteBst(Node* root, int key);
};

Node* Node::createBst(Node* root, int d) {
    if (root == NULL) {
        Node* newNode = new Node();
        newNode->data = d;
        return newNode;
    }

    if (d <= root->data) {
        root->left = createBst(root->left, d);
    } else {
        root->right = createBst(root->right, d);
    }

    return root;
}

void Node::inorder(Node* root) {
    if (root == NULL) {
        return;
    } else {
        inorder(root->left);
        cout << root->data << "\t";
        inorder(root->right);
    }
}

bool Node::searchElement(Node* root, int key) {
    Node* cur = root;
    while (cur != NULL) {
        if (cur->data == key) {
            return true;
        } else if (key < cur->data) {
            cur = cur->left;
        } else {
            cur = cur->right;
        }
    }
    return false;  // not found
}

int Node::predecessor(Node* root) {
    if (root == NULL) {
        return -1;
    }
     Node* cur = root->left;
    if (root->left != NULL) {
       
        while (cur->right != NULL) {
            cur = cur->right;
        }
        return cur->data;
    }

}

int Node::successor(Node* root) {
    if (root == NULL) {
        return -1;
    }
    Node* cur = root->right;
    if (root->right != NULL) {
        
        while (cur->left != NULL) {
            cur = cur->left;
        }
        return cur->data;
    }

}

Node* Node::deleteBst(Node* root, int key) {
    if (root == NULL) {
        return root;
    }

    if (key < root->data) {
        root->left = deleteBst(root->left, key);
    } else if (key > root->data) {
        root->right = deleteBst(root->right, key);
    } else {
        // Node with only one child or no child
        if (root->left == NULL) {
            Node* temp = root->right;
            delete root; // use delete instead of free
            return temp;
        } else if (root->right == NULL) {
            Node* temp = root->left;
            delete root; // use delete instead of free
            return temp;
        }

        // Node with two children: Get the inorder successor
        int min = successor(root);
        root->data = min;
        root->right = deleteBst(root->right, min);
    }

    return root;
}

int main() {
    Node* root = NULL;
    Node bst;

    root = bst.createBst(root, 50);
    root = bst.createBst(root, 30);
    root = bst.createBst(root, 70);
    root = bst.createBst(root, 40);
    root = bst.createBst(root, 60);
    root = bst.createBst(root, 80);
    root = bst.createBst(root, 10);
    root = bst.createBst(root, 45);

    cout << "Inorder traversal of BST: ";
    bst.inorder(root);
    cout << endl;

    int min = bst.successor(root->left);
    cout << "Successor of left child of root->right " << min << endl;
    int max = bst.predecessor(root->right);
    cout << "Predecessor of right child of root->left " << max << endl;
     
     Node* flag=bst.deleteBst(root,40);

     bst.inorder(root);

    return 0;
}
