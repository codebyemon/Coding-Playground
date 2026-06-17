#include<iostream>
#include<deque>
using namespace std;

/*
Deque(also called Double ended queue) when we give the ability
of pushing from front, poping from back and to see the back element
to the queue it becomes Deque.
*/
//Deque using deque STL

int main(){
    deque<int>dq;
    dq.push_back(1);
    dq.push_back(2);
    dq.push_back(3);
    dq.push_front(4); //4,1,2,3

    cout<<endl;
    cout<<dq.front()<<" "<<dq.back()<<endl;
    dq.pop_back(); //4,1,2
    cout<<dq.front()<<" "<<dq.back()<<endl;
    

    
    
    
    return 0;
}