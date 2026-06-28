#include<iostream>
#include<stack>
using namespace std;

int main(){
    stack<int>s;
    s.push(1);
    s.push(2);
    s.push(3);
    cout<<s.top()<<endl;//top() is a function which returns the top element of the stack.
    cout<<s.size()<<endl;//size() is a function which return the size of the stack.
    while(!s.empty()){//empty() is a function which returns boolean value about is the stack empty or not.
        cout<<s.top()<<endl;
        s.pop();//pop() is a function which delete the top element of the stack.
    }
    



    return 0;
}