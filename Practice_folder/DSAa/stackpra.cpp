//stack practice
#include<iostream>
using namespace std;
class stack
{
    int arr[5];
    int count;
    public:
    stack()
    {
        count=0;
    }
    void push(int n);
    bool empty();
    int top();
    int pop();
    int size();

};
bool  stack::empty()
{
    if(count==0)
    {
        return true;
    }
    return false;
}
int stack::  top()
{
    if(empty()==true)
    { 
      cout<<"stack underflow"<<endl;
      return -1;
    }
    return arr[count-1];
}
void stack:: push(int n)
{
    if(count<5)
    {
        arr[count]=n;
        count++;
    }
    else
    {
        cout<<"stack overflow"<<endl;
        return;
    }
}
int stack::size()
{
    return count;
}
int stack::pop()
{
    if(empty()==true)
    {
        cout<<"stack underflow"<<endl;
        return -1;
    }
    count--;
    return arr[count];
}
int main()
{
    stack st;
    int p1=st.pop();
    cout<<"pop in stack"<<p1<<endl;
    int t1=st.top();
    cout<<"top element in stack"<<t1<<endl;
     st.push(10);
     st.push(20);
     st.push(30);
     st.push(40);
     st.push(50);
     st.push(60);
     
      int p2=st.pop();
     cout<<"pop stack"<<p2<<endl;

     int t2=st.top();
     cout<<"top element in stack"<<t2<<endl;

     int s1=st.size();
     cout<<"size"<<s1<<endl;
}