#include<iostream>
using namespace std;

/*
The order of queue is FIFO where we can only push from back and pop from 
front also we can see only front element.
The most important functions of queue are push(also called enqueue),
pop(also called dequeue) and front.
*/
//Queue using Linked List

class Node{
public:
    int data;
    Node *next;
    Node(int val){
        data=val;
        next=NULL;
    }
};

class Queue{
    Node *head;
    Node *tail;
public:
    Queue(){
        head=tail=NULL;
    }

    void push(int data){ //insert data at tail
        Node *newNode= new Node(data);
        if(empty()){
            head=tail=newNode;
            return;
        }
        tail->next=newNode;
        tail=newNode;
    }

    void pop(){ //delete for head
        if(empty()){
            cout<<"Queue is EMPTY\n";
            return;
        }
        Node *temp=head;
        head=head->next;
        temp->next=NULL;
        delete temp;

    }

    int front(){
        if(empty()){
            cout<<"Queue is EMPTY\n";
            return -1;
        }
        return head->data;
    }

    bool empty(){
        return head==NULL;
    }

};

int main(){
    Queue q;
    q.push(1);
    q.push(2);
    q.push(3);
    while(!q.empty()){
        cout<<q.front()<<" ";
        q.pop();
    }
    cout<<endl;
    
    
    
    return 0;
}