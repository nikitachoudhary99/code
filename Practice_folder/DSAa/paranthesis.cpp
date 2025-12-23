#include<iostream>
#include<stack>
using namespace std;
int main()
{
    string str;
    cout<<"enter string"<<endl;
    cin>>str;

    stack<char> st;
    int s = str.size();

    for(int i=0;i<s;i++)
    {
        char ch = str[i];
        if(str[i]=='('||str[i]=='{'||str[i]=='[')
        {
        //push the opening bracket into the stack 
            st.push(str[i]);
        }
        else
        {
            if(st.empty())
            {
                cout<<"string has unbalanced"<<endl;
                return 0;
            }
            //get the top element of the stack(the last pushed opening bracket) 
            char top = st.top();
            if((ch==')'&& top=='(')|| (ch=='}'&& top=='{') ||(ch==']'&&top=='['))
            {
                st.pop();
            }
            else
            {
            //if the current closing bracket does not matched the top element of stack 
              cout<<"string has unbalanced"<<endl;
              return 0;
            }
        }
    }
    //if the stack is empty then opening bracket is matched
    if(st.empty())
    {
      cout<<"string has balanced"<<endl;
    }
    //if the stack is not empty then opening bracket is unmatched
    else
    {
        cout<<"string has unbalanced"<<endl;
    }
}