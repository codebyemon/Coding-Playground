#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> vec; //Initialisation method 1.
    cout<<vec.size()<<endl; //size() is a function which gives the size of vector as integer value.
     
    vec.push_back(1); //push_back() is a function which add data at the end of vector.
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(4);
    vec.emplace_back(5); //emplace_back() is also a function which work same as push_back.

    cout<<vec.size()<<endl;
    cout<<vec.capacity()<<endl; //capacity() is a fuction which gives the capacity of vector as integer value.
    //capacity always increase in bouble proportion. This is why here capacity and size are showing different number.
    for(int val : vec){
        cout<<val<<" ";
    }
    cout<<endl;

    vec.pop_back(); //pop_back() is a function which delete the last element of vector.
    for(int val : vec){
        cout<<val<<" ";
    }
    cout<<endl;
    cout<<"val at idx 2 "<<vec[2]<<" or "<<vec.at(2)<<endl; //These are the two ways of accessing any index of a vector
    cout<<"front: "<<vec.front()<<endl; //front() function gives the first element of a vector
    cout<<"back: "<<vec.back()<<endl; //back() function gives the last element of a vector
    
    



    return 0;
}