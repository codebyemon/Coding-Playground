#include<iostream>
#include<list>
using namespace std;
//List intermally implemented using doubly linked list. So it is not possible to access any random value using index of List
int main(){
    list<int> l1={1,2,3,4,5};//Method 1 of initialization
    list<int> l2; //Method 2 of initialization
    l2.emplace_back(1);
    l2.push_back(2);
    l2.emplace_front(3);
    l2.push_front(5);

    for(int val : l2){
        cout<<val<<" ";
    }
    cout<<endl;

    //All functions of Vector also work same for list 

    return 0;
}