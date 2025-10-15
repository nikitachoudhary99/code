//deque
#include<iostream>
#include<deque>
using namespace std;
class Deque
{
    int arr[5];
    int count;
    int front;
    int back;
    public:
    Deque()
    {
        count = 0;
        front = 0;
        back = 0;
    }
    void push_back(int n);
    int pop_back();
    bool empty();
    int pop();
    int size();
    int push_front(int n);
    int pop_front();
};
void Deque::push_back(int n)
{
 if (count<5)
 {
    arr[count] = n;
    count++;
 }
}
bool Deque::empty()
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
int Deque::pop_back()
{
 if(empty()==true)
 {
    cout<<"deque uderflow"<<endl;
    return -1;
 }
 count--;
 return arr[count];
}
int Deque::size()
{
 return count;
}
int Deque::push_front(int n)
{
 if(count<5)
 {
   front = (front-1+5)%5;
   arr[front] = n;
   count++;
 }
 else
 {
   cout<<"deque overflow"<<endl;

 }
}
int Deque::pop_front()
{
   if(empty()==true)
   {
      cout<<"deque underflow"<<endl;
      return -1;
   }
   int value = arr[front];
   front = (front+1)%5;
   count--;
   return value;
}
int main()
{
 Deque d;
 d.push_back(30);
 d.push_back(40);
 d.push_back(50);

 d.pop_back();

 cout<<"size of deque "<<d.size()<<endl;

 d.push_front(30);
 d.push_front(40);
 d.push_front(50);
 
 d.pop_front();
 d.pop_front();

cout<<"size of deque "<<d.size()<<endl;

  
} 