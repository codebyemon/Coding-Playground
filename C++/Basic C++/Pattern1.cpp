#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int r = 1;
    for(int i=1;i<=n;i++){
        for(int k=i;k<=n;k++){
            cout<<" "<<" ";
        }
        for(int j=1;j<=r;j++){
            cout<<i-abs(i-j)<<" ";

        }
        r+=2;
        cout<<endl;
    }
    
    return 0;
}