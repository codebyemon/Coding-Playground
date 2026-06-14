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
Constructor, function and operator orverloading is an example or implementation of 
compile time polymorphism
*/

class Student{
public:
    string name;
    Student(){
        cout<<"Non-parameterized\n";
    }
    Student(string name){ //Constructor overloading
        this->name=name;
        cout<<"Parameterized\n";
    }
};

class Print{
public:
    void show(int x){
        cout<<"Int: "<<x<<endl;
    }
    void show(char ch){ //Function overloading
        cout<<"Char: "<<ch<<endl;
    }
};


int main(){
    Student s1;
    Student s2("Emon");
    Print p1;
    p1.show(5);
    p1.show('C');
    
    
    return 0;
}

