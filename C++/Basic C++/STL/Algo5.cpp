#include<iostream>
using namespace std;

int main(){
    cout<<max(4,5)<<" "<<min(6,10)<<endl;
    int a=5,b=10;
    swap(a,b);
    cout<<a<<" "<<b<<endl;

    vector<int>vec={1,2,3,4,5};
    cout<<*(max_element(vec.begin(),vec.end()))<<endl;//It will show the max element of the vector.
    cout<<*(min_element(vec.begin(),vec.end()))<<endl;//It will show the min element of the vector.
    cout<<binary_search(vec.begin(),vec.end(),4)<<endl;//It will return a boolean value.
    cout<<binary_search(vec.begin(),vec.end(),10)<<endl;




    return 0;
}