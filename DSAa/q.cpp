//making queue
#include<iostream>
using namespace std;
#define size 5
class queue
{
    int arr[size];
    int count;
    public:
    queue()
    {
        count =0;
    }
    void push(int n);
    bool isfull();
    bool empty();
    int front();
    int pop();
    int back();
};
void queue:: push(int n)
{
    if(isfull()==true)
    {
        cout<<"queue underflow"<<endl;
        return -1;
    }
    return arr[0];
}
bool queue:: isfull()
{
    if(count==size)
    {
        return true;
    }return false;
}
bool queue::empty()
{
    if(count==0)
    {
        return true;
    }
    return false;
}
int queue:: front()
{
    if(isfull()==true)
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
    for(int i=0;i<size;i++)
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

    q.pop();

    int f=q.front();
    cout<<"front element"<<q.front()<<endl;

    int b=q.back();
    cout<<"back elememnt"<<q.back()<<endl;
    
}