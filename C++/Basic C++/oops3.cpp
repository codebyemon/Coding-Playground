#include<iostream>
#include<string>
using namespace std;


class Teacher{
private: 
    double salary;
public:

    string name;
    string dept;
    string subject;

    Teacher(){ 
        cout<<"Hi, I am non-parameterized constructor\n";
        dept = "CSE Depertment";
    }
    Teacher(string name, string dept, string subject, double salary){ 
        cout<<"Hi, I am parameterized constructor\n";
        this->name = name; 
        this->dept =dept; 
        this->subject= subject;
        this->salary = salary;
    }

    //Customized Copy constructor. This is also called shallow copy
    Teacher(Teacher &orgObj){ //pass by reference
        cout<<"I am custom copy constructor...\n";
        this->name = orgObj.name;
        this->dept= orgObj.dept;
        this->subject= orgObj.subject;
        this->salary= orgObj.salary;
    }
    

    
    void changeDept(string newDept){
        dept=newDept;
    }

    //Setter function
    void setSalary(double s){
        salary =s;
    }
    //getter function
    double getSalary(){
        return salary;
    }

    void getInfo(){
        cout<<"Name: "<<name<<endl;
        cout<<"Subject: "<<subject<<endl;
    }


};


int main(){
    Teacher t1("Rupom", "Textile","Chemicle", 20000); // Constructor call automatically
    Teacher t2(t1); // Here invoking custom copy constructor 

    t2.getInfo();
    
    
    
    return 0;
}

