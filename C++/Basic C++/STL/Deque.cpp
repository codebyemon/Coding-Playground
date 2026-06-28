#include<iostream>
#include<deque>
using namespace std;
//Deque stands for Double ended queue.
//Deque intermally implemented using dynamic arrays. So it is possible access any random value using index of deque.
int main(){
    deque<int>d={1,2,3,4,5};
    for(int val : d){
        cout<<val<<" ";
    }
    cout<<endl;

    //All function of List also work same on Deque.
    



    return 0;
}