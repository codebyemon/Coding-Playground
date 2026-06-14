#include<iostream>
using namespace std;
//Count prime numbers in a range using Sieve of Eratosthenes. Leetcode problem 204.

int countPrime(int n){
    vector<bool> isPrime(n+1,true);
    int count=0;
    for(int i=2;i<n;i++){
        if(isPrime[i]){
            count++;
            for(int j=i*2;j<n;j=j+i){
                isPrime[j]=false;
            }
        }
    }
    return count;
}

int main(){
    cout<<countPrime(50)<<endl;

    return 0;
}