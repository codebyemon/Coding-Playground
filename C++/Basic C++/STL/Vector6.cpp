#include<iostream>
#include<vector>
using namespace std;
//Creating iterator from scratch
int main(){
    //Method 1 of initialization
    vector<int>vec={1,2,3,4,5};
    vector<int>::iterator it1;
    for(it1=vec.begin();it1!=vec.end();it1++){//begin() points the address of 1 and end() points the address of the next block of 5.
        cout<<*(it1)<<" ";
    }
    cout<<endl;
    vector<int>::reverse_iterator it2;
    for(it2 = vec.rbegin();it2 !=vec.rend();it2++){//rbegin() points the address of 5 and rend() points the address of the previous block of 1.
        cout<<*(it2)<<" ";
    }
    cout<<endl;
    /*
    Method 2 of initialization
    vector<int>vec={1,2,3,4,5};
    for(vector<int>::iterator it1=vec.begin();it1!=vec.end();it1++){
        cout<<*(it1)<<" ";
    }
    cout<<endl;
    for(vector<int>::reverse_iterator it2 = vec.rbegin();it2 !=vec.rend();it2++){
        cout<<*(it2)<<" ";
    }
    cout<<endl;

    */

    /*
    Method 3 of initialization
    vector<int>vec={1,2,3,4,5};
    for(auto it1=vec.begin();it1!=vec.end();it1++){
        cout<<*(it1)<<" ";
    }
    cout<<endl;
    for(auto it2 = vec.rbegin();it2 !=vec.rend();it2++){
        cout<<*(it2)<<" ";
    }
    cout<<endl;

    */


    



    return 0;
}