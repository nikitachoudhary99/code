#include<iostream>
using namespace std;
#include<queue>

class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node() {
        left = NULL;
        right = NULL;
    }

    // Traversal methods
    void preorder(Node* root);
    void postorder(Node* root);
    void inorder(Node* root);

    // Insert element in BST
    Node* insertele(Node* root, int d);

    // Search element in BST
    bool searchele(Node* root, int key);
};

void Node::preorder(Node* root) {
    if (root == NULL) {
        return;
    }
    cout << root->data << " ";
    preorder(root->left);
    preorder(root->right);
}

void Node::postorder(Node* root) {
    if (root == NULL) {
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout << root->data << " ";
}

void Node::inorder(Node* root) {
    if (root == NULL) {
        return;
    }
    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}

Node* Node::insertele(Node* root, int d) {
    if (root == NULL) {
        Node* temp = new Node;
        temp->data = d;
        return temp;
    }
    if (d <= root->data) {
        root->left = insertele(root->left, d);
    } else {
        root->right = insertele(root->right, d);
    }
    return root;
}

bool Node::searchele(Node* root, int key) {
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
    return false;
}

int main() {
    Node* root = NULL;
    Node bst;

    // Inserting elements into the BST
    root = bst.insertele(root, 20);
    root = bst.insertele(root, 22);
    root = bst.insertele(root, 15);
    root = bst.insertele(root, 30);
    root = bst.insertele(root, 35);
    root = bst.insertele(root, 40);

    // Traversals
    cout << "Preorder traversal: ";
    bst.preorder(root);
    cout << endl;

    cout << "Postorder traversal: ";
    bst.postorder(root);
    cout << endl;

    cout << "Inorder traversal: ";
    bst.inorder(root);
    cout << endl;

    // Search for an element
    bool flag = bst.searchele(root, 35);
    flag ? cout << "Element found" << endl : cout << "Element not found" << endl;

    return 0;
}
