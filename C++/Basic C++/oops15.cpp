#include<iostream>
#include<string>
using namespace std;
/*
Static Keyword
Static Variables
-variables declared as static in a function are created & initialised
once for the lifetime of the program.
-Static variables in a class are created & initialised once. They are
shared by all the objects of the class.
*/

void fun(){
    int x=0;
    static int y=0;
    cout<<"x: "<<x<<endl;
    cout<<"y: "<<y<<endl;
    x++;
    y++;
}
int main(){
    fun();
    fun();
    fun();
    
   
    return 0;
}

