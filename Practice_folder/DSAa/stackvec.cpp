//stack by tamplate using vector
#include<iostream>
#include<vector>
using namespace std;
template<typename t>
class stack
{
  t arr[100];
  int count;
  public:
  stack()
  {
    count =0;
  }
  void push(t n);
  t pop();
  bool empty();
  t top();
  int size();
};
template<typename t>
t stack<t>::pop()
{
    if(empty()==true)
    {
        cout<<"stack underflow"<<endl;
    }
    else
    {
        count--;
        return arr[count];
    }
    return arr[count];
}
template<typename t>
bool stack<t>:: empty()
{
    if(count == 0)
    {
        return true;
    }
    return false;
}
template<typename t>
int stack<t>::size()
{
   return count;
}
template<typename t>
t stack<t>:: top()
{ 
    if(empty()==true)
    {
        cout<<"stack underflow"<<endl;
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
        count ++;
    }
    else
    {
        cout<<"stack overflow"<<endl;
    }
}
int main()
{
    stack<int> t;
    t.push(10);
    t.push(20);
    t.push(30);
    t.push(40);
    t.push(50);
    t.push(60);
    t.push(70);
    t.push(80);
    t.push(90);
    t.push(100);
    t.push(110);

   int p= t.pop();
    cout<<"after pop "<<p <<endl;
    int s=t.size();
    cout<<"size stack"<< t.size()<<endl;

    int t1=t.top();
    cout<<"top elemnt "<<t.top()<<endl;
    
}