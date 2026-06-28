#include<iostream>
#include<string>
using namespace std;
/*
Abstraction means hiding all unnecessary details & showing only the 
important parts
*/
/*
Access modifiers and abstract classes are the way of implementing abstraction
*/
/*
Abstract Classes
-abstract classes are used to provide a base class from which other classes can be derived.
-they cannot be instantiated and are meant to be inherited.
-abstract classes are typically used to define an interface of derived classes.
*/
class Shape{
    virtual void draw()=0; //pure virtual function. Now this class becomes abstract class.
};
class Circle: public Shape{
public: 
    void draw(){
        cout<<"Drawing a circle\n";
    }
        

};


int main(){
    Circle c1;
    c1.draw();
   
    return 0;
}

