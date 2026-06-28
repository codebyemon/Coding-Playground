#include<iostream>
using namespace std;

int main(){
    vector<pair<int,int>>vec = {{1,2},{2,3},{3,4}};
    vec.push_back({4,5});//it just insert the value. So we must give a pair to it.
    vec.emplace_back(5,6);// it first create a pair then insert the value. So we do not need to give a pair
    //emplace_back() is more faster.
    for(pair<int,int>p:vec){//or we can use auto here insted of pair<int,int>
        cout<<p.first<<" "<<p.second<<endl;
    }
    



    return 0;
}