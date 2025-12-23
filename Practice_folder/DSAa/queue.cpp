//making queue
#include<iostream>
#include<stack>
#define size 5
using namespace std;
class queue
{
 int arr[5];
 int count;
 public:
 queue()
 {
    count=0;
 }
 void push(int n);
 bool isfull();
 bool empty();
 int front();
 int pop();
 int back();

};
bool queue::isfull()
{
   if(count==size)
   {
   return true;
   }
   return false;
}
void queue::push(int n)
{
   if(isfull()==true)
   {
      cout<<"queue overflow"<<endl;
   }
   else
   {
      arr[count]=n;
      count++;
   }
}
bool queue::empty()
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
int queue::front()
{
   if(empty()==true)
   {
      cout<<"queue underflow"<<endl;
       return -1;
   }
   return arr[0];
}
int queue::pop()
{
   if(empty()==true)
   {
      cout<<"queue underflow"<<endl;
      return -1;
   }
   int temp=arr[0];
   for(int i=0;i<size-1;i++)
   {
      arr[i]=arr[i+1];

   }
   count--;
   return temp;
}
int queue::back()
{
   if(empty()==true)
   {
      cout<<"queue underflow"<<endl;
      return -1;
   }
   return arr[count-1];
}
int main()
{
   queue q;
   q.push(10);
   q.push(20);
   q.push(30);
   q.push(40);
   q.push(50);
   q.push(60);
   q.push(70);
   int f=q.front();
   cout<<" front ele= " << f << endl;
   q.push(60);
   int b=q.back();
   cout<<"back element of queue"<<b<<endl;
}