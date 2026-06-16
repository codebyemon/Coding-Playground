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
class List{
    Node *head;
    Node *tail;

public:
    List(){
        head = tail = NULL;
    }

    Node* getHead(){
        return head;
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
    List ll1, ll2;

    ll1.push_back(1);
    ll1.push_back(3);
    ll1.push_back(5);
    ll1.push_back(7);
    ll1.push_back(9);
   

    ll2.push_back(2);
    ll2.push_back(4);
    ll2.push_back(6);
    ll2.push_back(8);
    ll2.push_back(10);
    Merge m;
    m.mergeTwoSortedLL(ll1.getHead(),ll2.getHead());
    ll2.printLL();
    
    
    return 0;
}
