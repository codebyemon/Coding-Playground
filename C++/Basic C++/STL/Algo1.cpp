#include<iostream>
using namespace std;

int main(){
    int arr[5]={3,5,1,8,2};
    sort(arr,arr+5);
    for(int val:arr){
        cout<<val<<" ";
    }
    cout<<endl;

    vector<int>vec={3,5,1,8,2};
    sort(vec.begin(),vec.end());//sort() is a function which arrange element in ascending order.
    for(int val: vec){
        cout<<val<<" ";
    }
    cout<<endl;

    sort(vec.begin(),vec.end(),greater<int>());//greater<int>() is a functors which helps to arrange element in descending order.
    for(int val: vec){
        cout<<val<<" ";
    }
    cout<<endl;



    return 0;
}