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
    int top();
    int pop();
    int size();
    bool empty();
    
};
bool Stack ::empty()
{
    if(count==0)
    {
    return true;
    }
    return false;
}

void Stack :: push(int n)
{
    if(count<5)
    {
    arr[count] = n;
    count++;
    }
    else
    {
        cout<<"stack overflow"<<endl;
    }
    return;
}

int Stack :: top()
{
 if(empty()==true)
 {
    cout<<"stack underflow"<<endl;
    return-1;
 }
 return arr[count-1];
}

int Stack ::pop()
{
if(empty()==true)
{
cout<<"stack underflow"<<endl;
return -1;
}
count--;
return arr[count];
}

int Stack::size()
{
    return count;
}
int main()
{
 Stack s1;
 //int o = s1.pop();
 //cout<<"pop in stack "<<o<<endl;
 s1.push(10);
 s1.push(20);
 //s1.push(30);
 //s1.push(40);
 //s1.push(50);

 int t = s1.top();
 cout<<"Top element of stack = "<<t<<endl;

 //int s = s1.size();
 //cout<<"size of stack is "<<s<<endl;

 int p = s1.pop();
 cout<<"pop of stack = "<<p<<endl;

 //bool e = s1.empty();
 //cout<<"empty stack "<<e<<endl;
 
 int t1 = s1.top();
 cout<<"top element of stack = "<<t1<<endl;

 int p1 = s1.pop();
 cout<<"pop element = "<<p1<<endl;

}