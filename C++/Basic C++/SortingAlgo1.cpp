#include<iostream>
using namespace std;

//The following algorithm is the Bubble sort algorithm and it's time complexity is O(n^2).
void bubbleSort(int arr[], int n){ //TC = O(n^2)
    for(int i=0;i<n-1;i++){
        bool isSwap = false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){ // here (>) is for ascending order and (<) is for descending order
                swap(arr[j],arr[j+1]);
                isSwap=true;
            }
        }
        if(!isSwap){ //Array is already sorted
            return;
        }
    }
}

//The following algorithm is the Selection sort algorithm and it's time complexity is O(n^2).
void selectionSort(int arr[], int n){
    for(int i=0;i<n-1;i++){
        int smallesIdx = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[smallesIdx]){ // here (<) is for ascending order and (>) is for descending order
                smallesIdx=j;
            }
        }
        swap(arr[i],arr[smallesIdx]);
    }
}

//The following algorithm is the Insertion sort algorithm and it's time complexity is O(n^2).
void insertionSort(int arr[], int n){
    for(int i=1;i<n;i++){
        int curr=arr[i];
        int prev=i-1;

        while(prev>=0 && arr[prev]>curr){ // here (>) is for ascending order and (<) is for descending order
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr; //placing the current element in its correct position
    }
}

void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}


int main(){
    int n=5;
    int arr[]={4,1,5,2,3};
    insertionSort(arr,n);
    printArray(arr,n);
    
    return 0;
}