#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int>vec={1,2,3,4,5};

    vec.erase(vec.begin()); //Here erase() is a function which can delete any element of a vector
    // begin() is a iterator.

    for(int val : vec){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec1={1,2,3,4,5};
    vec1.erase(vec1.begin()+2); 
    for(int val : vec1){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec2={1,2,3,4,5};
    vec2.erase(vec2.begin()+1,vec2.begin()+3); 
    for(int val : vec2){
        cout<<val<<" ";
    }
    cout<<endl;



    return 0;
}