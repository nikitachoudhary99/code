//reverse string with the help of stack
#include<iostream>
#include<stack>
using namespace std;
int main()
{
    string str;
    stack<char> st;
    cout<<"enter string"<<endl;
    cin>>str;

    for(int i=0;i<str.size();i++)
    {
        st.push(str[i]);
    }
    cout<<"your reverse string "<<endl;
    while(st.empty()!=true)
    {
        cout<<st.top();
        st.pop();
    }
}