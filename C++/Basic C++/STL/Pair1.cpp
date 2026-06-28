#include<iostream>
using namespace std;
//Pair is the part of C++ utility library.
int main(){
    pair<string, int> p={"Emon",5};
    cout<<p.first<<endl;
    cout<<p.second<<endl;
    pair<int,pair<char,int>> pp={1,{'a',3}};
    cout<<pp.first<<endl;
    cout<<pp.second.first<<endl;
    cout<<pp.second.second<<endl;
    



    return 0;
}