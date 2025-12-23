//dequeue
#include<iostream>
using namespace std;
class Dequeue
{
    int arr[5];
    int count;
    public:
    Dequeue()
    {
        count=0;
    }
    void push(int n);
    //bool isfull();
    int size();
    bool empty();
    int push_front();
    int pop_front();
    int back();
};
void Dequeue:: push(int n)
{
  if(count<5)
  {
    arr[count]=n;
    count++;
  }
}
// bool Dequeue:: isfull()
// {
//   if(count==size)
//   {
//     return true;
//   }
//   return false;
// }
bool Dequeue:: empty()
{
   if(count==0)
   {
    return true;
   }  
   return false;
}
//int Dequeue:: front()
//{
  //if(empty()==true)
  //{

  //}
//}
int Dequeue::pop()
{ 
    if(empty()==true)
    {
        cout<<"Dequeue is underflow"<<endl;
        return -1;
    }
    
    
   count--;
   return arr[count];
}
int Dequeue:: size()
{
return count;
}

int main()
{
    Dequeue d;
    d.push(10);
    d.push(20);
    cout<<"deque element"<<d.size()<<endl;
}