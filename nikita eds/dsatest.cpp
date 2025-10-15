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
    cout<<"stack is overflow"<<endl;
   }
}
int Stack::pop()
{
 if(empty()==true)
 {
    cout<<"stack is overflow"<<endl;
    return -1;
 }
 return arr[count-1];
}
int Stack::top()
{
 if(empty()==true)
 {
    cout<<"stack is underflow"<<endl;
 }
 count--;
 return arr[count];
}
int Stack::size()
{
 return count;
}
bool Stack::empty()
{
    if(count==0)
    {
        return true;
    }
    return false;
}
int main()
{
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
     
    s.pop();
 
     cout<<"top element "<<s.top()<<endl;
     cout<<"size"<<s.size()<<endl;
}