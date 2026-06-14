#include<iostream>
#include<string>
using namespace std;
/*
Polymorphism is the ability of objects to take on different forms or behave
in different ways depending on the context in which they are used.
There are 2 types of polymorphism- 
1. Compile time polymorphism
2. Run time or Dynamic polymorphism
*/

/*
Function orverridding and virtual functions is an example or implementation of 
run time polymorphism
*/
/*
Parent & child both contain the same function with different implementation then 
the parent class function is said to be overridden.
*/
/*
A virtual function is a member function that you expect to be redefined in derived classes.
It same as function overridding but this is dynamic because it is called during run time.
*/

class Parent{
public:
    void getInfo(){
        cout<<"Parent class\n";
    }
    virtual void hello(){
        cout<<"Hello from parent\n";
    }
};

class Child: public Parent{
public:
    void getInfo(){
        cout<<"Child class\n";
    }
    void hello(){
        cout<<"Hello from child\n";
    }
};


int main(){
    Child c1;
    c1.getInfo();
    c1.hello();
    Parent p1;
    p1.getInfo();
    p1.hello();
    
    
    return 0;
}

