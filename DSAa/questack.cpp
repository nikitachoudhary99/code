stack using queue
#include<iostream>
#include<queue>
using namespace std;
class stack
{
    queue<int>pq;
    queue<int>sq;
    public:
    void push(int n);
    int pop();
    int back();
    int front();
    bool empty();
};
void stack::push(int n)
{
    sq.push(n);
    while(pq.empty()!=true)
    {
        sq.push(pq.front());
        pq.pop();
    }
    swap(pq,sq);
}
int stack::pop()
{
    if(pq.empty()==true)
    {
        cout<<"queue underflow"<<endl;
        return -1;
    }
    int top=pq.front();
    pq.pop();
    return top;
}
int stack::front()
{
    if(pq.empty()==true)
    {
        cout<<"queue underflow"<<endl;
        return -1;
    }
    return pq.front();
}
int stack:: back()
{
    if(pq.empty()==true)
    {
        cout<<"queue underflow"<<endl;
        return -1;
    }
    return pq.back();
}
bool stack:: empty()
{
    if(pq.empty()!=true)
    {
        return true;
    }
    return pq.empty();
}
int main()
{
    stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.pop();

    cout<<"front element"<<s.front()<<endl;
    cout<<"back element"<<s.back()<<endl;
    s.pop();
    cout<<"front element"<<s.front()<<endl;

}