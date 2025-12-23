#include<iostream>
using namespace std;
class Stack
{
    int arr[5];
    int count;
    public:
    Stack()
    {
        count = 0;
    }
    void push(int n);
    int pop();
    int top();
    int size();
    bool empty();
};
void Stack::push(int n)
{
 if(count<5)
 {
  arr[count] = n;
  count++;
 }
 else
 {
    cout<<"stack overflow "<<endl;
    return;
 }
}
int Stack::top()
{
 if(empty()==true)
 {
    cout<<"stack underflow"<<endl;
    return -1;
 }
 return arr[count-1];   
}
int Stack::pop()
{
 if(empty()==true)
 {
    cout<<"stack underflow"<<endl;
    return -1;
 }
 count--;
 return arr[count];
}
 bool Stack::empty()
 {
   if(count==0)
   {
    return true;
   } 
   return false;
 }
int Stack::size()
{
 return count;
}
int main()
{
    Stack s1;
    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);
    s1.push(50);

    s1.pop();

    cout<<"top value = "<<s1.top()<<endl;

    s1.push(60);
    s1.push(70);
   
}