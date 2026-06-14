#include<iostream>
#include<string>
using namespace std;
/*
When properties & member functions of base class
are passed on to the derived class is called Inheritance
*/
//Multi-level Inheritance

class Person{ 
public: 
    string name;
    int age;
    
};

class Student : public Person{
public: 
    int rollno;
   
};

class GradStudent : public Student{
public:
    string researchArea;
};
int main(){
    GradStudent s1;
    s1.name="Tony Stark";
    s1.researchArea = "Quantum Physics";
    cout<<s1.name<<endl;
    cout<<s1.researchArea<<endl;
    
    return 0;
}

