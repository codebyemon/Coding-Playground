#include<iostream>
#include<vector>
using namespace std;
/*
Vector is a container.
*/
int main(){
    vector<int> vec; //Initialisation method 1.
     
    vec.push_back(1); 
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(4);
    vec.push_back(5); 

    for(int val : vec){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec1={1,2,3,4,5}; //Initialisation method 2.
    for(int val : vec1){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec2(3,10); //Initialisation method 3.
    for(int val : vec2){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec3(vec1); //Initialisation method 4.
    for(int val : vec3){
        cout<<val<<" ";
    }
    







    return 0;
}