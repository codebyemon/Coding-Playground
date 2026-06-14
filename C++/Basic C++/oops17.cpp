#include<iostream>
#include<string>
using namespace std;
/*
Static Keyword
Static Objects
- It stays in the memory lifetime of the program.
*/

class ABC{
public:
    ABC(){
        cout<<"constructor\n";
    }
    ~ABC(){
        cout<<"destructor\n";
    }
};

int main(){
    if(true){
        ABC obj1;
        static ABC obj2;
    }
    cout<<"end of main fun\n";
    
    
   
    return 0;
}

