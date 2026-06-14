#include<iostream>
#include<string>
using namespace std;
/*
When properties & member functions of base class
are passed on to the derived class is called Inheritance
*/

class Person{ //Parent or Base class
public: 
    string name;
    int age;
    Person(){
        cout<<"Hi, I am Person constructor"<<endl;

    }
    ~Person(){
        cout<<"Hi, I am Person destructor"<<endl;
    }

};

class Student : public Person{// This is now inherited from Person class. So Student is a child or derived class
public: 
    int rollno;
    Student(){
        cout<<"Hi, I am Student constructor"<<endl;
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
    Student s1; //Here calling constructors starts from base to derived class. But calling destructors starts from derived to base class
    s1.name="Emon";
    s1.age=22;
    s1.rollno=1234;
    s1.getInfo();
    
    return 0;
}

