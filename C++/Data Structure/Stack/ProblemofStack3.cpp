#include <iostream>
using namespace std;
//find the value from postfix operation
int main(){
    string s;
    cin >> s;
    stack<int> num;
    string ch;
    for (int i = 0; i < s.size(); i++){
        if (s[i] == ','){
            if (ch == "+" || ch == "-" || ch == "*" || ch == "/"){
                int a = num.top();
                num.pop();
                int b = num.top();
                num.pop();
                if (ch == "+"){
                    num.push(b + a);
                }  
                else if (ch == "-"){
                    num.push(b - a);
                }    
                else if (ch == "*"){
                    num.push(b * a);
                } 
                else if (ch == "/"){
                    num.push(b / a);
                }
                    
            }
            else{
                num.push(stoi(ch));
            }
            ch.clear();
        }
        else{
            ch+=s[i];
        }
    }
    cout << num.top() << endl;

    return 0;
}