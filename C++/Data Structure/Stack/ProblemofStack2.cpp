#include<iostream>
#include<stack>
using namespace std;
//Converting infix to postfix.
int main(){
    string s;
    cin>>s;
    stack<char>ch;
    for(int i=0;i<s.size();i++){
        if(s[i]=='(' || s[i]=='+' || s[i]=='-' || s[i]=='*' || s[i]=='/'){
            ch.push(s[i]);
            continue;
        }
        if(s[i]==')'){
            cout<<ch.top();
            ch.pop();
            ch.pop();
        }
        else{
            cout<<s[i];
        }
    }
    cout<<endl;
    return 0;
}