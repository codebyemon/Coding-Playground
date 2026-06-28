#include<iostream>
#include<stack>
using namespace std;

//The valid parentheses problem. Leetcode problem 20.

bool isValid(string str){
    stack<char>ch;
    for(int i=0;i<str.size();i++){
        if(str[i]=='('||str[i]=='{'||str[i]=='['){ //for opening
            ch.push(str[i]);
        }
        else{ //closing
            if(ch.size()==0){
                return false;
            }
            if((ch.top()=='('&&str[i]==')')
             ||(ch.top()=='{'&&str[i]=='}')
             ||(ch.top()=='['&&str[i]==']')){ //for matches 
                ch.pop();
            }
            else{ //for no matches
                return false;
            }
        }
    }
    return ch.size()==0;
}

int main(){
    string str;
    cin>>str;
    cout<<isValid(str)<<endl;
    


    return 0;
}