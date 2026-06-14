#include<iostream>
#include<string>
using namespace std;
/*
When properties & member functions of base class
are passed on to the derived class is called Inheritance
*/
//Hierarchial Inheritance

class Person{
public:
    string name;
    int age;

};

class Student: public Person{
public:
    int rollno;
   
};

class Teacher: public Person{
public:
    string subject;
    
};


int main(){
    
    
    return 0;
}

