#include<iostream>
#include<string>
using namespace std;
/*
When properties & member functions of base class
are passed on to the derived class is called Inheritance
*/
//Hybrid Inheritance

class Person{
public:
    string name;
    int age;

};

class Student: public Person{
public:
    int rollno;
   
};

class GradStudent: public Student{
public:
    string researchArea;

};

class Teacher: public Person{
public:
    string subject;
    
};

class TA : public Student, public Teacher {

};


int main(){
    
    
    return 0;
}

