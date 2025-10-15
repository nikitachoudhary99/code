#include<iostream>
using namespace std;

class Node {
public:
    int data;
    Node* prev;
    Node* next;

    Node(int d) {
        data = d;
        prev = next = nullptr;
    }

    void insertAtHead(Node*& head, int d);
    void deletion(Node*& head, int d);
    void display(Node* head);
    void displayReverse(Node* head);
};

void Node::displayReverse(Node* head) {
    if (head == nullptr) {
        cout << "No linked list created" << endl;
        return;
    }
    Node* cur = head;
    // Traverse to the last node
    while (cur->next != head) {
        cur = cur->next;
    }
    // Traverse in reverse direction
    do {
        cout << cur->data << " --> ";
        cur = cur->prev;
    } while (cur != head);
    cout << endl;
}

void Node::display(Node* head) {
    if (head == nullptr) {
        cout << "No linked list created" << endl;
        return;
    }
    Node* cur = head;
    do {
        cout << cur->data << " --> ";
        cur = cur->next;
    } while (cur != head);
    cout << endl;
}

void Node::insertAtHead(Node*& head, int d) {
    Node* temp = new Node(d);
    if (head == nullptr) {
        head = temp;
        temp->next = head;
        temp->prev = head;
    } else {
        temp->next = head;
        temp->prev = head->prev;
        head->prev->next = temp;
        head->prev = temp;
        head = temp;
    }
}

void Node::deletion(Node* & head, int d) {
    if (head == nullptr) {
        cout << "No linked list created" << endl;
        return;
    }

    Node* cur = head;

    // Case 1: Head node deletion
    if (head->data == d) {
        if (head->next == head) { // Only one node in the list
            delete head;
            head = nullptr;
            return;
        } else {
            Node* temp = head;
            head = head->next;
            head->prev = temp->prev;
            temp->prev->next = head;
            delete temp;
            return;
        }
    }

    // Case 2: Middle or End node deletion
    cur = head->next;
    while (cur != head) {
        if (cur->data == d) {
            cur->prev->next = cur->next;
            cur->next->prev = cur->prev;
            delete cur;
            return;
        }
        cur = cur->next;
    }

    cout << "Element " << d << " not found in the list" << endl;
}

int main() {
    Node* head = nullptr;
    Node DLL(0);  // Creating an instance for calling the member functions

    // Inserting nodes at the head
    DLL.insertAtHead(head, 10);
    DLL.insertAtHead(head, 20);
    DLL.insertAtHead(head, 30);
    DLL.insertAtHead(head, 40);
    DLL.insertAtHead(head, 50);

    // Display the list in forward direction
    cout << "Circular Doubly Linked List in forward direction:" << endl;
    DLL.display(head);

    // Display the list in reverse direction
    cout << "Circular Doubly Linked List in reverse direction:" << endl;
    DLL.displayReverse(head);

    // Delete a node
    cout << "Deleting node with value 30:" << endl;
    DLL.deletion(head, 30);
    DLL.display(head);
    
    // Try to delete a node that doesn't exist
    cout << "Deleting node with value 100:" << endl;
    DLL.deletion(head, 100);
    DLL.display(head);
  
    return 0;
}
