#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;
    Node(int value){
        data = value;
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
    void push_front(int value){
        Node *newNode = new Node(value);
        if (head == NULL){
            head = tail = newNode;
            return;
        }
        newNode->next = head;
        head = newNode;
    }

    void push_back(int value){
        Node *newNode = new Node(value);
        if (head == NULL){
            head = tail = newNode;
            return;
        }
        tail->next = newNode;
        tail = newNode;
    }

    void pop_front(){
        if (head == NULL){
            cout << "LL is empty\n";
            return;
        }
        Node *temp = head;
        head = head->next;
        temp->next = NULL;
        delete temp;
    }

    void pop_back(){
        if (head == NULL){
            cout << "LL is empty\n";
            return;
        }
        Node *temp = head;
        while (temp->next != tail){
            temp = temp->next;
        }
        temp->next = NULL;
        delete tail;
        tail = temp;
    }

    void insertAtPos(int value, int pos){
        if (pos < 0){
            cout << "Invalid position\n";
            return;
        }
        Node *newNode = new Node(value);
        if (pos == 0){
            newNode->next = head;
            head = newNode;
            return;
        }
        Node *temp = head;
        for (int i = 0; i < (pos - 1); i++){
            if (temp == NULL){
                cout << "Invalid position\n";
                return;
            }
            temp = temp->next;
        }
        newNode->next = temp->next;
        temp->next = newNode;
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
        Node *temp = head;
        while (temp != NULL){
            if (temp->data < value && temp->next->data >= value){
                newNode->next = temp->next;
                temp->next = newNode;
                return;
            }
            temp = temp->next;
        }
    }

    int countEle(Node *head){
        int count = 0;
        if (head == NULL){
            cout << "LL is empty\n";
            return count;
        }
        Node *temp = head;
        while (temp != NULL){
            count++;
            temp = temp->next;
        }
        return count;
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
        Node *temp = head;
        while (temp->next->data != value){
            temp = temp->next;
            if (temp == NULL)
            {
                cout << "Element not found!\n";
            }
        }
        Node *trash = temp->next;
        temp->next = temp->next->next;
        delete trash;
    }

    int search(int value){
        if (head == NULL){
            cout << "LL is empty\n";
            return -1;
        }
        int idx = 0;
        Node *temp = head;
        while (temp != NULL){
            if (temp->data == value)
            {
                return idx;
            }
            temp = temp->next;
            idx++;
        }
        return -1;
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

    void checkIdentical(Node *head1){
        Node *temp, *temp1;
        temp = head;
        temp1 = head1;
        while (temp != NULL){
            if (temp1 == NULL || temp->data != temp1->data ){
                cout << "Not identical\n";
                return;
            }
            temp = temp->next;
            temp1 = temp1->next;
        }
        if(temp1!=NULL){
            cout << "Not identical\n";
            return;
        }
        cout << "Identical\n";
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

    void printLL(){
        if (head == NULL){
            cout << "LL is empty\n";
            return;
        }
        Node *curr = head;
        while (curr != NULL){
            cout << curr->data << "->";
            curr = curr->next;
        }
        cout << "NULL\n";
    }
};

int main(){
    LinkedList ll1, ll2;

    ll1.push_back(1);
    ll1.push_back(3);
    ll1.push_back(5);
    ll1.push_back(7);
    ll1.push_back(9);
   

    ll2.push_back(9);
    ll2.push_back(7);
    ll2.push_back(5);
    ll2.push_back(3);
    ll2.push_back(1);

    ll1.isSortedAsc();
    ll2.isSortedAsc();


    // ll1.mergeTowLL(ll2.head, ll2.tail);
    ll1.printLL();
    
    
}
