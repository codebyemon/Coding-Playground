#include<iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;

    Node(int val){
        data=val;
        next=NULL;
    }
};

class CircularLL{
    Node *head;
    Node *tail;
public:
    CircularLL(){
        head=tail=NULL;
    }

    void insertAtHead(int val){
        Node *newNode=new Node(val);
        if(head==NULL){
            head=tail=newNode;
            tail->next=head;
            return;
        }
        newNode->next=head;
        head=newNode;
        tail->next = head;
        /*
        We can write the above code like following
        newNode->next=tail->next;
        tail->next=newNode;
        Because tail->next=head same thing
        */
    }

    void insertAtTail(int val){
        Node *newNode=new Node(val);
        if(head==NULL){
            head=tail=newNode;
            tail->next=head;
            return;
        }
        newNode->next=head;
        tail->next=newNode;
        tail=newNode;
    }

    void deleteAtHead(){
        if(head==NULL){
            cout<<"Circular List is Empty\n";
            return;
        }
        if(head==tail){//for single node
            delete head;
            head=tail=NULL;
            return;
        }
        Node *temp=head;
        head=head->next;
        tail->next=head;
        temp->next=NULL;
        delete temp;

    }

    void deleteAtTail(){
        if(head==NULL){
            cout<<"Circular List is Empty\n";
            return;
        }
        if(head==tail){//for single node
            delete head;
            head=tail=NULL;
            return;
        }
        Node *temp=tail;
        Node *prev=head;
        while(prev->next!=tail){
            prev=prev->next;
        }
        tail=prev;
        tail->next=head;
        temp->next=NULL;
        delete temp;
    }

    void printll(){
        if(head==NULL){
            cout<<"Circular List is Empty\n";
            return;
        }
        cout<<head->data<<"->";
        Node *curr=head->next;
        while(curr!=head){
            cout<<curr->data<<"->";
            curr=curr->next;
        }
        cout<<curr->data<<endl;
    }

};

int main(){
    CircularLL cll;
    cll.insertAtTail(1);
    cll.insertAtTail(2);
    cll.insertAtTail(3);

    cll.printll();

    cll.deleteAtTail();
    cll.printll();
    
    
    
    return 0;
}