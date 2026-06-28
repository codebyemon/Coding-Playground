#include<iostream>
using namespace std;
bool comparator1(pair<int,int>p1,pair<int,int>p2){
    if(p1.second<p2.second) return true;
    else return false;
}
bool comparator2(pair<int,int>p1,pair<int,int>p2){
    if(p1.second<p2.second) return true;
    if(p1.second>p2.second) return false;

    if(p1.first<p2.first) return true;
    else return false;
}
int main(){
    vector<pair<int,int>>vec{{3,1},{2,1},{7,1},{5,2}};
    cout<<"Sorting according to first value:\n";
    sort(vec.begin(),vec.end());//It will sort it only on the bases of first value.
    for(pair<int,int> p:vec){
        cout<<p.first<<" "<<p.second<<endl;
    }

    cout<<"Sorting according to second value:\n";
    sort(vec.begin(),vec.end(),comparator1);//It will sort it only on the bases of second value.
    for(pair<int,int> p:vec){
        cout<<p.first<<" "<<p.second<<endl;
    }

    cout<<"Sorting according to second value:\n";
    sort(vec.begin(),vec.end(),comparator2);//It will sort it on the bases of second value. But if two 
    //values of two pairs are same then it will sort on the bases of first value.
    for(pair<int,int> p:vec){
        cout<<p.first<<" "<<p.second<<endl;
    }



    return 0;
}