#include<iostream>
#include<string>
using namespace std;


class Teacher{
private: // Assess Modifiers
    double salary;// Data hiding
public:
//Properties or attributes
    string name;
    string dept;
    string subject;

    Teacher(){ // This is non-parameterized constructor(special function) which does not have any return type.
        cout<<"Hi, I am non-parameterized constructor\n";
        dept = "CSE Depertment";
    }
    Teacher(string name, string dept, string subject, double salary){ // Constructor overloading
        cout<<"Hi, I am parameterized constructor\n";
        this->name = name; //Here this key word is pointing the object.
        this->dept =dept; // It helps to access the object's properties.
        this->subject= subject;
        this->salary = salary;
    }
    

    // Methods or function or member functions
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
    Teacher t1; // Constructor call automatically
    Teacher t2;
    Teacher t3("Rupom", "Textile","Chemicle", 20000);
    t1.name = "emon";
    //t1.salary =50000 it will show error because it is private attribute.
    t1.setSalary(50000);

    cout<<t1.name<<endl;
    cout<<t1.getSalary()<<endl;
    cout<<t1.dept<<endl;
    cout<<t2.dept<<endl;
    t3.getInfo();
    
    
    return 0;
}

