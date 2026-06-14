#include<iostream>
#include<string>
using namespace std;

class Student{

public:
    string name;
    double *cgpaPtr;
    Student(string name, double cgpa){
        this->name=name;
        cgpaPtr = new double;
        *cgpaPtr=cgpa;
        
    }
    Student(Student &obj){// This is called deep copy
        this->name=obj.name;
        cgpaPtr= new double;
        *cgpaPtr=*obj.cgpaPtr;

    }
    void getInfo(){
        cout<<"Name: "<<name<<endl;
        cout<<"CGPA: "<<*cgpaPtr<<endl;
    }

};
int main(){
    Student s1("Emon",4);
    s1.getInfo();
    Student s2(s1);
    *(s2.cgpaPtr)= 3.2;
    s2.name="Rupom";
    s1.getInfo();
    s2.getInfo();
   
    
    
    return 0;
}

