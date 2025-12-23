#include<iostream>
#include<queue>
using namespace std;
class Stack
{
  queue<int> pque;
  queue<int> sque;
  public:
  void push(int n);
  int pop();
  bool empty();
  int front();
  int back();
};
void Stack::push(int n)
{
  sque.push(n);

  while(pque.empty()!=true)
  {
     
        sque.push(pque.front());
        pque.pop();
  }
  swap(pque,sque);
}
bool Stack::empty()
{
 if(pque.empty()!=true)
 {
    return true;
 }
 return true;
}
int Stack::pop()
{
 if(pque.empty()==true)
 {
    cout<<"stack is underflow"<<endl;
    return -1;
 }
 int top = pque.front();
 pque.pop();
 return top;
}
int Stack::front()
{
 if(pque.empty()==true)
 {
    cout<<"stack is underflow"<<endl;
    return -1;
 }
 return pque.front();
}
int Stack::back()
{
 if(pque.empty()==true)
 {
    cout<<"stack underflow"<<endl;
    return -1;
 }
 return sque.back();
}
int main()
{
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    
    s.pop();

    cout<<"front element in Stack "<<s.front()<<endl;
    
    cout<<"back element in stack "<<s.back()<<endl;

    
}
