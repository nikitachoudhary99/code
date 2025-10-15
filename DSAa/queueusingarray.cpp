#include<iostream>
#define size 100
using namespace std;
class Queue
{

    int arr[size];
    int count;
    public:
    Queue()
    {
        count = 0;
    }
    void push(int n);
    bool isFull();
    bool empty();
    int pop();
    int front();
    int back();

};
void Queue::push(int n)
{
 if(isFull()==true)
 {
  cout<<"Queue overflow"<<endl;
  return;
 }
 else
 {
    arr[count] = n;
    count++;
 }
}
bool Queue::isFull()
{
  if(count==size)
  {
  return true;
  }
return false;
}
bool Queue::empty()
{
  if(count==0)
  {
    return true;
  }
  else
  {
  return false;
  }
}
int Queue::pop()
{
 if(empty()==true)
 {
    cout<<"Queue is underflow"<<endl;
    return -1;
 }
 int temp = arr[0];
 for(int i=0;i<count-1;i++)
 {
    arr[i] = arr[i+1];
 }
 count--;
 return temp;
 
}
int Queue::front()
{
    if(empty()==true)
    {
      cout<<"Queue is underflow"<<endl;
      return -1;
    }
    return arr[0];
}
int Queue::back()
{
    if(empty()==true)
    {
        cout<<"queue is underflow"<<endl;
        return -1;
    }
    return arr[count-1];
}
int main()
{
 Queue q;
 q.push(10);
 q.push(20);
 q.push(30);
 q.push(40);
 q.push(50);

 int f = q.front();
 cout<<"front element "<<f<<endl;

 int b = q.back();
 cout<<"back element "<<b<<endl;

 q.pop();

 f = q.front();
 cout<<"front element "<<f<<endl;

 q.push(60);
 q.push(70);

 q.pop();

}