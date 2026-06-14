#include<iostream>
using namespace std;

// We can use binary search only on sorted array.

// This is Iterative Method. In this method TC=O(logn) and SC=O(1)
int binarySearch1(vector<int>arr,int tar){
    int start=0,end=arr.size()-1;
    while(start<=end){
        int mid=start + (end-start)/2;
        if(tar>arr[mid]){
            start=mid+1; // 2nd half
        }
        else if(tar<arr[mid]){
            end=mid-1; // 1st half
        }
        else{ //mid = ans
            return mid;
        }
    }
    return -1;
}

// This is Recursive Method. In this method TC=O(logn) and SC=O(logn)
int binarySearch2(vector<int>arr,int tar,int start,int end){
    if(start<=end){
        int mid = start +(end-start)/2;
        if(tar>arr[mid]){ // 2nd half
            return binarySearch2(arr,tar,mid+1,end);
        }
        else if(tar<arr[mid]){ // 1st half
            return binarySearch2(arr,tar,start,mid-1);
        }
        else{ //mid = ans
            return mid;
        }
    }
    return -1;
}

int main(){
    vector<int>arr1={-1,0,3,4,5,9,12};//odd
    int tar1=9;
    cout<<binarySearch1(arr1,tar1)<<endl;

    vector<int>arr2={-1,0,3,5,9,12};//even
    int tar2=5;
    int start =0, end=arr2.size()-1;
    cout<<binarySearch2(arr2,tar2,start,end)<<endl;
    
    return 0;
}