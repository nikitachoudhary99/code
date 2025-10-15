#include<iostream>
using namespace std;

class Node {
public:
    int data;
    Node *next;

    Node() {
        next = nullptr;  // Constructor initializing the next pointer to null
    }

    void insertAtHead(Node* &head, int d);
    void insertAtMiddle(Node* &head, int data, int newdata);
};

void Node::insertAtHead(Node* &head, int d) {
    Node* temp = new Node;
    temp->data = d;
    temp->next = head;
    head = temp;
}

void Node::insertAtMiddle(Node* &head, int data, int newdata) {
    Node* cur = head;
    while (cur != nullptr && cur->data != data) {
        cur = cur->next;
    }
    if (cur != nullptr) {
        Node* temp = new Node;
        temp->data = newdata;
        temp->next = cur->next;
        cur->next = temp;
    } else {
        cout << "Data " << data << " not found in the list!" << endl;
    }
}

int main() {
    Node ll;
    Node* head = nullptr;

    ll.insertAtHead(head, 10);
    ll.insertAtHead(head, 20);
    ll.insertAtHead(head, 30);

    ll.insertAtMiddle(head, 20, 25);  // Inserting after node with value 20

    Node* cur = head;
    while (cur != nullptr) {
        cout << cur->data << " ----> ";
        cur = cur->next;
    }
    cout << "NULL" << endl;  // To indicate the end of the list

    return 0;
}
