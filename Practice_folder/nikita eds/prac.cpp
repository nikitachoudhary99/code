#include<iostream>
#define size 5
using namespace std;
class Queue
{
    int arr[size];
    int count;

    Queue()
    {
        count = 0;
    }
    void push(int n);
    bool isFull();
    bool empty();
    

};
void Queue::push(int n)
{
  if(isFull()==true)
  {
    cout<<"queue overrflow"<<endl;
    return ;
  }
  else
  {
    arr[count] = n;
    count++;
  }
}