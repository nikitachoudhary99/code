//stack ->work on LIFO manner
/* 
common operation
push()
pop()
empty()
size()
top()
*/
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
bool stack:: empty()
{
    if(count==0)
    {
        return true;
    }
    return false;
}
void stack:: push(int n)
{
    if(count<5)
    {
        arr[count]=n;
        count ++;
    }
    else
    {
        cout<<"error ->stack overflow"<<endl;
        return;
    }
}
int stack:: pop()
{
    if(empty()==true)
    {
        cout<<"stack under flow"<<endl;
        return -1;
    }
    count--;
    return arr[count];
}
int stack::size()
{
    return count;
}
int stack::top()
{
   if(empty()==true)
   {
    cout<<"stack underflow"<<endl;
    return -1;
   }
   return arr[count-1];
}
int main()
{
    stack s;
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(80);
    
    int p=s.pop();
    cout<<"pop in stack"   <<  p<<endl;
    
    int p1=s.top();
    cout<<"top element in stack"  <<  p1<<endl;
   
    int s1=s.size();
    cout<<"stack size="  << s1<<endl;

    int p2=s.pop();
    cout<<" pop "  <<  p2<<endl;

    int s2=s.size();
    cout<<"stack size after pop" << s2<<endl;
}