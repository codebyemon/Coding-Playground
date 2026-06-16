#include<iostream>
using namespace std;

//Stack using array

class Stack{
private:
    int cc;
    int top;
    int* arr;
    
public:
    Stack(int capacity){
        this->cc = capacity;
        arr = new int[cc];
        top = -1;
    }
    
    void push(int val){
        if(top >= cc - 1){
            cout<<"Stack is full\n";
            return;
        }
        arr[++top] = val;
    }

    void pop(){
        if(top < 0){
            cout<<"Stack is empty\n";
            return;
        }
        top--;
    }

    int topEle(){
        if(top < 0) return -1;
        return arr[top];
    }

    bool empty(){
        return top < 0;
    }
    
    ~Stack(){
        delete[] arr;
    }
};

int main(){
    Stack s(5);
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.empty()){
        cout<<s.topEle()<<" ";
        s.pop();
    }
    cout<<endl;
    return 0;
}