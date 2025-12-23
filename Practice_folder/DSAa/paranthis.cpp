//Wap to check valid paranthesis((),{},[])
#include<iostream>
#include<stack>
using namespace std;
int main()
{
    string str;
    cout<<"enter string"<<endl;
    cin>>str;
    int s = str.size();
    stack<char> st;
    for(int i=0;i<s;i++)
    {
        char ch = str[i];
        if(str[i]=='('||str[i]=='{'||str[i]=='[')
        {
            st.push(str[i]);
        }
        else
        {
            if(st.empty())
            {
                cout<<"string has unbalanced"<<endl;
                return 0;
            }
            char top = st.top();
            if((ch==')'&& top=='(')||(ch=='}'&&top=='{')||(ch==']'&&top=='['))
            {
                st.pop();
            }
            else
            {
                cout<<"string has unbalanced"<<endl;
                return 0;
            }
        }

    }
    if(st.empty())
    {
        cout<<"string balanced"<<endl;
    }
    else
    {
        cout<<"string has unbalanced"<<endl;
    }
    return 0;
}