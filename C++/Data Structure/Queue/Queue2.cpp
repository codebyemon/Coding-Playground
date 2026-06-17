#include<iostream>
#include<queue>
using namespace std;

//Queue using queue STL

int main(){
    queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);
    while(!q.empty()){
        cout<<q.front()<<" ";
        q.pop();
    }
    cout<<endl;
    

    return 0;
}