#include<iostream>
#include<map>
using namespace std;

int main(){
    map<string,int>m;
    m["tv"]=100;
    m["laptop"]=100;
    m["headphones"]=50;
    m["tablet"]=120;
    m["watch"]=50;

    m.insert({"camera",25});
    m.emplace("phone",50);
    m.erase("tv");

    for(auto p : m){
        cout<<p.first<<" "<<p.second<<endl;
    }
    cout<<"Count of the key ="<<m.count("laptop")<<endl;
    cout<<"Count of the value of laptop ="<<m["laptop"]<<endl;

    if(m.find("camera")!=m.end()){//find() is a function which used to find the key, if it is found then it return the iterator of the 
    //key if not then it return m.end().
        cout<<"found\n";
    }
    else{
        cout<<"not found\n";
    }

    



    return 0;
}