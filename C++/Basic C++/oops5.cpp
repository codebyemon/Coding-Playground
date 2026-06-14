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
    //Destructor which is opposite of constructor
    //Because constructor allocate the memory
    //Destructor deallocate the memory
    ~Student(){ //This destructor called automatically
        cout<<"Hi, I delete everything\n";
        delete cgpaPtr;
    }
    
    void getInfo(){
        cout<<"Name: "<<name<<endl;
        cout<<"CGPA: "<<*cgpaPtr<<endl;
    }

};
int main(){
    Student s1("Emon",4);
    s1.getInfo();
    
    return 0;
}

