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
};
int main(){
    List ll;
    ll.push_front(3);
    ll.push_front(2);
    ll.push_front(1);
    ll.insertAtPos(4,1);

    
    ll.printLL();

    cout<<ll.search(3)<<endl;

    return 0;
}
