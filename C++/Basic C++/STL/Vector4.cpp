#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int>vec={1,2,3,4,5};
    vec.insert(vec.begin()+2,100);//insert() is a function which used to insert any value in the vector at any position.
    for(int val : vec){
        cout<<val<<" ";
    }
    cout<<endl;

    vec.clear();//clear() is a function which delete all element of the vector and makes the size of the vector zero but capacity remains same.
    for(int val : vec){
        cout<<val<<" ";
    }
    cout<<vec.empty()<<endl;//empty() is a function which return the boolean value about is vector empty or not.



    return 0;
}