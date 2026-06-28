#include<iostream>
using namespace std;

int main(){
    vector<int>vec1={1,2,3,4,5};
    reverse(vec1.begin(),vec1.end());//reverse() is a function which will reverse the whole vector/array.
    for(auto val:vec1){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec2={1,2,3,4,5};
    reverse(vec2.begin()+1,vec2.begin()+3);//reverse() is a function which will reverse the vector/array in a range.
    for(auto val:vec2){
        cout<<val<<" ";
    }
    cout<<endl;
    



    return 0;
}