#include<iostream>
#include<string>
using namespace std;
/*
Static Keyword
Static Variables
-variables declared as static in a function are created & initialised
once for the lifetime of the program.
-Static variables in a class are created & initialised once. They are
shared by all the objects of the class.
*/

class A{
public:
    static int x;
    void incx(){
        x+=1;
    }
};
int A::x = 0;
int main(){
    A a1;
    A a2;
    a1.x=500;
    a1.incx();
    cout<<a2.x<<endl;

    
    
   
    return 0;
}

