//parenthis prblm 
#include<iostream>
using namespace std;
int main()
{
    string str;
    int s;
    cout<<" enter string "<<endl;
    cin>>str;
    s=str.size();
    stack<char>str;
    for(int i=0;i<s;i++)
    {
        char ch=str[i];
        if(str[i]=='(' || str[i]=='{' || str[i]=='[')
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
            char top=st.top();
            if((ch==')')  && top=='('|| (ch=='}') && top=='{' || (ch==']') && top=='[')
            {  
               st.pop(); 
            }
            else{
                cout<<"string has unbalanced"<<endl;
                return 0;
            }
        }
        if(st.empty())
        {
            cout<<"string balanced"<<endl;
            return 0;
        }
    }

}