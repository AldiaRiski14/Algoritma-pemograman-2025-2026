#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
};
Node* head = NULL;
Node* tail = NULL;

void addFront(int data){
    Node* n = new Node{data, head};
    if(!head) head = tail = n;
    else head = n;
}

void addBack(int data){
    Node* n = new Node{data, NULL};
    if(!head) head = tail = n;
    else { tail->next = n; tail = n; }
}

void deleteFront(){
    if(!head) return;
    Node* temp = head;
    head = head->next;
    if(!head) tail = NULL;
    delete temp;
}

void deleteBack(){
    if(!head) return;
    if(head == tail){
        delete head;
        head = tail = NULL;
        return;
    }
    Node* temp = head;
    while(temp->next != tail)
        temp = temp->next;
    delete tail;
    tail = temp;
    tail->next = NULL;
}

void printList(){
    Node* t = head;
    while(t){
        cout << t->data << " -> ";
        t = t->next;
    }
    cout << "NULL" << endl;
}

int main(){
    addFront(10);
    addFront(20);
    addBack(30);
    addBack(40);
    cout << "List awal: ";
    printList();

    deleteFront();
    cout << "Setelah menghapus dari depan: ";
    printList();

    deleteBack();
    cout << "Setelah menghapus dari belakang: ";
    printList();
}
