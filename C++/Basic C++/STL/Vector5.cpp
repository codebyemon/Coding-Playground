#include<iostream>
#include<vector>
using namespace std;
/*
begin() is an iterator which points to the first element of the vector.
end() is also an iterator which does not point to last element(n-1) of the vector. Insted it 
points to the next element(n) of the last element of the vector which may contain gurbage value.
*/

int main(){
    vector<int>vec={1,2,3,4,5};
    cout<<*(vec.begin())<<endl;
    cout<<*(vec.end())<<endl;
    cout<<*(vec.end()-1)<<endl;





    return 0;
}