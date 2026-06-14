#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    if(n<2){
        cout<<"Non prime number\n";
        return 0;
    }
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            cout<<"Non prime number\n";
            return 0;
        }
    }
    cout<<"Prime number\n";
    
    
    return 0;
}