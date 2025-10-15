#include<iostream>
#include<stack>
using namespace std;
class Queue
{
    stack<int> pst;
    stack<int> sst;
    public:
    void push(int n);
    bool empty();
    int front();
    int pop();
    int back();
};
void Queue::push(int n)
{
    pst.push(n);
   
}
bool Queue::empty()
{
 if(pst.empty()==true)
 {
    cout<<"queue underflow"<<endl;
    return true;
 }
 return false;
}
int Queue::front()
{
    if(empty()==true)
    {
        cout<<"queue is underflow"<<endl;
        return -1;
    }

    while(pst.empty()!=true)
    {
    sst.push(pst.top());
    pst.pop();
    }
  int temp = sst.top();

  while(sst.empty()!=true)
  {
    pst.push(sst.top());
    sst.pop();
  }
  return temp;

}
int Queue::pop()
{
   if(empty()==true)
    {
        cout<<"queue is underflow"<<endl;
        return -1;
    }

    while(pst.empty()!=true)
    {
    sst.push(pst.top());
    pst.pop();
    }
    int temp = sst.top();
    sst.pop();

   while(sst.empty()!=true)
   {
    pst.push(sst.top());
    sst.pop();
   }
   return temp;
}
int Queue::back()
{
    if(empty()==true)
    {
        cout<<"queue underflow"<<endl;
        return -1;
    }
    return pst.top();
}
int main()
{
    Queue Q;
    Q.push(10);
    Q.push(20);
    Q.push(30);
    Q.push(40);
    Q.push(50);

    cout<<"front element in queue\t"<<Q.front()<<endl;

    cout<<"back element in queue\t"<<Q.back()<<endl;

    Q.pop();

    cout<<"front element in queue\t"<<Q.front()<<endl;

    Q.push(60);

    cout<<"back element in queue\t"<<Q.back()<<endl;

}