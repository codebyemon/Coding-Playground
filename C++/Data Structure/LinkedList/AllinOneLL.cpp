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
class LinkedList{
public:
    Node *head;
    Node *tail;

    LinkedList(){
        head = tail = NULL;
    }

    void push_front(int val){
        Node *newNode = new Node(val);
        if (head == NULL){
            head = tail = newNode;
            return;
        }
        else{
            newNode->next = head;
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

    void insertAtPos(int val, int pos){
        if(pos<0){
            cout<<"Invalid possition\n";
            return;
        }
        if(pos==0){
            push_front(val);
            return;
        }
        Node *curr = head;
        for(int i=0;i<pos-1;i++){
            if(curr==NULL){
                cout<<"Invalid possition\n";
                return;
            }
            curr= curr->next;
        }
        Node *newNode = new Node(val);
        newNode->next=curr->next;
        curr->next=newNode;
    }

    void inserInSortedAsen(int value){
        Node *newNode = new Node(value);
        if (head == NULL){
            head = tail = newNode;
            return;
        }
        if (head->data >= value){
            newNode->next = head;
            head = newNode;
            return;
        }
        if (tail->data <= value){
            tail->next = newNode;
            tail = newNode;
            return;
        }
        Node *curr = head;
        while (curr != NULL){
            if (curr->data < value && curr->next->data >= value){
                newNode->next = curr->next;
                curr->next = newNode;
                return;
            }
            curr = curr->next;
        }
    }

    void deleteEle(int value){
        if (head->data == value){
            pop_front();
            return;
        }
        if (tail->data == value){
            pop_back();
            return;
        }
        Node *curr = head;
        while (curr->next->data != value){
            curr = curr->next;
            if (curr == NULL)
            {
                cout << "Element not found!\n";
            }
        }
        Node *trash = curr->next;
        curr->next = curr->next->next;
        delete trash;
    }

    void deleteEntireLL(){
        if (head == NULL){
            cout << "LL is empty\n";
            return;
        }
        while (head != NULL){
            Node *temp = head;
            head = head->next;
            temp->next = NULL;
            delete temp;
        }
        tail = NULL;
    }

    void deleteDuplicateInSortedAsc(){
        if (head == NULL){
            cout << "LL is empty";
            return;
        }
        Node *temp=head;
        if (head->data == head->next->data){
            head=head->next;
            temp->next=NULL;
            delete temp;
        }
        Node *curr = head;
        while (curr->next != NULL){
            if (curr->data == curr->next->data){
                temp = curr->next;
                curr->next = curr->next->next;
                temp->next=NULL;
                delete temp;
                continue;
            }
            curr = curr->next;
        }
    }

    void checkIdentical(Node *head2){
        Node *curr1, *curr2;
        curr1 = head;
        curr2 = head2;
        while (curr1 != NULL){
            if (curr2 == NULL || curr1->data != curr2->data ){
                cout << "Not identical\n";
                return;
            }
            curr1 = curr1->next;
            curr2 = curr2->next;
        }
        if(curr2!=NULL){
            cout << "Not identical\n";
            return;
        }
        cout << "Identical\n";
    }

    int search(int key){
        Node *curr = head;
        int idx =0;

        while(curr != NULL){
            if(curr->data==key){
                return idx;
            }
            curr=curr->next;
            idx++;
        }
        return -1;
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

    Node *middleNode(){
        Node *slow = head;
        Node *fast = head;
        while(fast !=NULL && fast->next !=NULL){
            slow = slow->next;
            fast=fast->next->next;
        }
        return slow;
    }

    bool hasCycle(){
        Node *slow = head;
        Node *fast = head;
        while(fast !=NULL && fast->next !=NULL){
            slow = slow->next;
            fast=fast->next->next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    Node *startPointofCycle(Node *head){
        Node *slow = head;
        Node *fast = head;
        bool isCycle = false;

        while(fast !=NULL && fast->next !=NULL){
            slow = slow->next;
            fast = fast->next->next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(!isCycle){
            return NULL;
        }
        slow = head;
        while(slow!=fast){
            slow= slow->next;
            fast=fast->next;
        }
        return slow;
    }

    void removeCycle(Node *head){
        Node *slow = head;
        Node *fast = head;
        bool isCycle = false;

        while(fast !=NULL && fast->next !=NULL){
            slow = slow->next;
            fast = fast->next->next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(!isCycle){
            return;
        }
        slow = head;
        Node *prev = NULL;
        while(slow!=fast){
            slow= slow->next;
            prev=fast;
            fast=fast->next;
        }
        prev->next=NULL;
        return;
    }

    void mergeTowLL(Node *head2, Node *tail2){
        if(head==NULL){
            head=head2;
            tail=tail2;
            return;
        }
        if(head2==NULL){
            tail->next=head2;
            return;
        }
        tail->next=head2;
        tail=tail2;
    }

    Node *mergeTwoSortedLL(Node *head1, Node *head2){
        if(head1==NULL || head2==NULL){
            return head1==NULL ? head2:head1;
        }
        if(head1->data<=head2->data){
            head1->next=mergeTwoSortedLL(head1->next,head2);
            return head1;
        }
        else{
            head2->next=mergeTwoSortedLL(head1,head2->next);
            return head2;
        }
    }

    void isSortedAsc(){
        if (head == NULL){
            cout << "LL is empty\n";
            return;
        }
        Node *curr=head;
        while(curr->next!=NULL){
            if(curr->data>curr->next->data){
                cout<<"Not sorted\n";
                return;
            }
            curr=curr->next;
        }
        cout<<"Sorted\n";
    }

    int countEle(Node *head){
        int count = 0;
        if (head == NULL){
            cout << "LL is empty\n";
            return count;
        }
        Node *curr = head;
        while (curr != NULL){
            count++;
            curr = curr->next;
        }
        return count;
    }

    void printLL(){
        if (head == NULL){
            cout << "LL is empty\n";
            return;
        }
        Node *curr = head;
        while (curr != NULL){
            cout << curr->data << " -> ";
            curr = curr->next;
        }
        cout <<" NULL"<<endl;
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

};

class ReverseList {
public:
    Node* reverse(LinkedList &ll) {
        Node *prev = NULL;
        Node *curr = ll.head;
        while (curr != NULL) {
            Node *nextNode = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextNode;
        }
        ll.tail = ll.head;
        ll.head = prev;
        return ll.head;
    }
};

class ReverseList{
public:
    Node* reverse(Node* head){
        Node* prev = NULL;
        Node* curr = head;
        while(curr != NULL){
            Node* next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
};

class Merge{
public: 
    Node *mergeTwoSortedLL(Node *head1, Node *head2){
        if(head1==NULL || head2==NULL){
            return head1==NULL ? head2:head1;
        }
        if(head1->data<=head2->data){
            head1->next=mergeTwoSortedLL(head1->next,head2);
            return head1;
        }
        else{
            head2->next=mergeTwoSortedLL(head1,head2->next);
            return head2;
        }
    }
};

int main(){
   
    return 0;
}
