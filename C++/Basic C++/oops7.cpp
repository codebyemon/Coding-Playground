#include<iostream>
#include<string>
using namespace std;
/*
When properties & member functions of base class
are passed on to the derived class is called Inheritance
*/

class Person{ 
public: 
    string name;
    int age;
    Person(string name, int age){
        cout<<"Hi, I am Person constructor"<<endl;
        this->name=name;
        this->age=age;
    }
    
    ~Person(){
        cout<<"Hi, I am Person destructor"<<endl;
    }

};

class Student : public Person{
public: 
    int rollno;
    Student(string name, int age, int rollno): Person(name, age){
        cout<<"Hi, I am Student constructor"<<endl;
        this->rollno=rollno;
    }
    ~Student(){
        cout<<"Hi, I am Student destructor"<<endl;
    }
    void getInfo(){
        cout<<"Name: "<<name<<endl;
        cout<<"Age: "<<age<<endl;
        cout<<"Roll: "<<rollno<<endl;
    }

};
int main(){
    Student s1("Emon",21,1234); 
    s1.getInfo();
    
    return 0;
}

