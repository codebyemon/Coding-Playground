#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;
    Node(int val){
        data = val;
        next = NULL;
    }
};
class List{
    Node *head;
    Node *tail;

public:
    List(){
        head = tail = NULL;
    }

    void reverse() {
        Node* prev = NULL;
        Node* curr = head;
        Node* next = NULL;

        tail = head; // The current head will become the new tail
        while (curr != NULL) {
            next = curr->next; // Store next node
            curr->next = prev; // Reverse the link
            prev = curr;       // Move prev forward
            curr = next;       // Move curr forward
        }
        head = prev; // Update head to the last non-null node
    }

    void push_front(int val){
        Node *newNode = new Node(val);
        if (head == NULL){
            head = tail = newNode;
            return;
        }
        else{
            newNode->next = head; // This is the shorted version of (*newNode).next=head.
            head = newNode;
        }
    }

    void push_back(int val){
        Node *newNode = new Node(val);
        if (head == NULL){
            head = tail = newNode;
            return;
        }
        else{
            tail->next = newNode;
            tail = newNode;
        }
    }

    void pop_front(){
        if(head==NULL){
            cout<<"LL is empty\n";
            return;
        }
        Node *temp = head;
        head = head->next;
        temp->next=NULL;
        delete temp;
    }

    void pop_back(){
        if(head==NULL){
            cout<<"LL is empty\n";
            return;
        }
        Node *temp = head;
        while(temp->next != tail){
            temp = temp->next;
        }
        temp->next=NULL;
        delete tail;
        tail = temp;
    }

    void insert(int val, int pos){
        if(pos<0){
            cout<<"Invalid possition\n";
            return;
        }
        if(pos==0){
            push_front(val);
            return;
        }
        Node *temp = head;
        for(int i=0;i<pos-1;i++){
            if(temp==NULL){
                cout<<"Invalid possition\n";
                return;
            }
            temp= temp->next;
        }
        Node *newNode = new Node(val);
        newNode->next=temp->next;
        temp->next=newNode;
    }

    int search(int key){
        Node *temp = head;
        int idx =0;

        while(temp != NULL){
            if(temp->data==key){
                return idx;
            }
            temp=temp->next;
            idx++;
        }
        return -1;
    }

    void print_head() {
        if (head == NULL) {
            cout << "LL is empty" << endl;
        }
        else {
            cout << "Head: " << head->data << endl;
        }
    }

    void print_tail() {
        if (tail == NULL) {
            cout << "LL is empty" << endl;
        }
        else {
            cout << "Tail: " << tail->data << endl;
        }
    }

    void printLL(){
        Node *temp = head;
        while (temp != NULL){
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout <<" NULL"<<endl;
    }
};
int main(){
    List ll;
    
    ll.push_back(1);
    ll.push_back(2);
    ll.push_back(3);
    ll.push_back(4);
    
    ll.printLL();
    ll.print_head();
    ll.print_tail();

    cout << "Reversing the list..." << endl;
    ll.reverse();

    ll.printLL();
    ll.print_head();
    ll.print_tail();
    return 0;
}
