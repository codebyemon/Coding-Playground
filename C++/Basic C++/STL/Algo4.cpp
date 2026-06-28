#include<iostream>
using namespace std;

int main(){
    string s="abc";
    next_permutation(s.begin(),s.end());//It with show the next permutation of the string.
    cout<<s<<endl;
    prev_permutation(s.begin(),s.end());//It with show the previous permutation of the string.
    cout<<s<<endl;




    return 0;
}