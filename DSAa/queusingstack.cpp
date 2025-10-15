//queusingstack queue using stack not working 
#include<iostream>
#include<stack>
using namespace std;
class Queue
{
    stack<int> pst;
    stack<int> sst;
    public:
    void push(int n);
    int front();
    bool empty();
    int back();
    int top();
    int pop();
};
void Queue::push(int n)
{
    sst.push(n);
}
int Queue::front()
{
    if(empty()==true)
    {
        cout<<"underflow"<<endl;
        return -1;
    }
    while(pst.empty()!=true)
    {
        pst.pop();
    }
    int temp=sst.top();
    while(sst.empty()!=true)
    {
        pst.push(sst.top());
        sst.pop();
    }
    return temp;
}
bool Queue::empty()
{
    if(pst.empty()==true)
    {
        return true;
    }
    return false;
}
int Queue::back()
{
    if(empty()==true)
    {
        cout<<"underflow"<<endl;
        return -1;
    }
}
int Queue::pop()
{
    if(empty()==true)
    {
        cout<<"underflow"<<endl;
        return -1;
    }
    while(pst.empty()!=true)
    {
        sst.push(pst.top());
        //int(n)=sst.top();
        //pst.push(n);
        sst.pop();
    }
    return 0;
}
int main()
{
    Queue q;
    q.push(10);
    q.push(20);
    q.push(30);
    q.push(40);
    q.push(50);
    cout<<"front element="<<q.front()<<endl;
     cout<<"front element="<<q.front()<<endl;
     q.pop();
      cout<<"front element="<<q.front()<<endl;
      q.push(20);
       cout<<"back element="<<q.back()<<endl;    


}