#include<iostream>
#include<stack>
using namespace std;

int main(){
    stack<int>s1;
    stack<int>s2;
    s1.push(1);
    s1.push(2);
    s1.push(3);
    
    s2.swap(s1);//swap() is a function which swap values between two different stacks.
    cout<<"S1 size: "<<s1.size()<<endl;
    cout<<"S2 size: "<<s2.size()<<endl;

    



    return 0;
}