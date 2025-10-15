 //stack using queue
#include<iostream>
#include<queue>
using namespace std;
class Stack
{
    queue<int> pq;
    queue<int> sq;
    public:
    void push(int n);
    int pop();
    int front();
    int back();
    bool empty();
};
void Stack::push(int n)
{
  sq.push( n);
  while(pq.empty()!=true)
  {
   sq.push(pq.front());
   pq.pop();
  }
  swap(pq,sq);
}
int Stack::pop()
{ 
    if(pq.empty()==true)
    {
        cout<<"underflow"<<endl;
        return -1;
    }
    int top=pq.front();
    pq.pop();
    return top;
}
int Stack::front()
{
 if(pq.empty()==true)
 {
    cout<<"underflow"<<endl;
    return -1;
}
return pq.front();

}
int Stack::back()
{
    if(pq.empty()==true)
    {
        cout<<"underflow"<<endl;
        return -1;
    }
    return pq.back();
}
bool Stack::empty()
{

if(pq.empty()!=true)
{
    return true;
}
return pq.empty();
}
int main()
{
    Stack s;
    s.push(10);
   // s.push(20);
   // s.push(30);
    s.push(40);
    s.push(50);
    s.pop();
    cout<<"front element"<<s.front()<<endl;
    cout<<"back element"<<s.back()<<endl;
    
    cout<<"front element"<<s.front()<<endl;

    cout<<"back element"<<s.back()<<endl;

}