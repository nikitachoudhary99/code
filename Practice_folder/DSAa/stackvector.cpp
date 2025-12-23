//vectore using template
#include<iostream>
using namespace std;
template<typename t>
class stack
{
    t arr[100];
    int count;
    public:
    stack()
    {
        count=0;
    }
    void push(t n);
    bool empty();
    t top();
    int size();
    t pop();
};
template<typename t>
t stack<t>::pop()
{
    if(empty()==true)
    {
        cout<<"stack underflow"<<endl;
        //return -1;
    }
    else
    {
        count--;
        return arr[count];
    }
    return arr[count];
}
template<typename t>
int stack<t>::size()
{
    return count;
}
template<typename t>
bool stack<t>::empty()
{
    if(count==0)
    {
        return true;
    }
    return false;
}
template<typename t>
t stack<t>:: top()
{
    if(empty()==true)
    {
        cout<<"stack overflow"<<endl;
    }
    else
    {
        return arr[count-1];
    }
}
template<typename t>
void stack<t>::push(t n)
{
    if(count<100)
    {
        arr[count]=n;
        count++;
    }
    else
    {
        cout<<"stack overflow"<<endl;
      // return ; 
    }

}
int main()
{
    stack<string>st;
    st.pop();
    st.push("nikita");
    st.push("nukul");
    st.push("samaira");
    string t=st.top();
    cout<<"top element of stack="<<t<<endl;

    int s=st.size();
}

