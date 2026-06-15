#include<iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;
    Node *prev;
    Node(int val){
        data=val;
        next=prev=NULL;
    }

};

class DList{
    Node *head;
    Node *tail;
public:
    DList(){
        head=tail=NULL;
    }
    void push_front(int val){
        Node *newNode = new Node(val);
        if(head==NULL){
            head=tail=newNode;
            return;
        }
        newNode->next=head;
        head->prev=newNode;
        head=newNode;
    }
    void push_back(int val){
        Node *newNode = new Node(val);
        if(head==NULL){
            head=tail=newNode;
            return;
        }
        newNode->prev=tail;
        tail->next=newNode;
        tail=newNode;
    }
    void pop_front(){
        if(head==NULL){
            cout<<"LL is already empty\n";
            return;
        }
        Node *temp=head;
        head=head->next;
        if(head!=NULL){
            head->prev=NULL;
        }
        temp->next=NULL;
        delete temp;
    }
    void pop_back(){
        if(head==NULL){
            cout<<"LL is already empty\n";
            return;
        }
        Node *temp=tail;
        tail=tail->prev;
        if(tail!=NULL){
            tail->next=NULL;
        }
        temp->prev=NULL;
        delete temp;
    }
    void printLL(){
        Node *curr=head;
        while(curr!=NULL){
            cout<<curr->data<<"<->";
            curr=curr->next;
        }
        cout<<"NULL\n";
    }
};

int main(){
    DList dl1;
    dl1.push_back(1);
    dl1.push_back(2);
    dl1.push_back(3);
    dl1.push_back(4);
    dl1.push_back(5);
    dl1.pop_front();
    dl1.pop_back();
    dl1.printLL();


    



    return 0;
}