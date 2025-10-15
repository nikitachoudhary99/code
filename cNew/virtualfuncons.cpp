
//virtual function in constroctor
//an abstract class can have constrocter
#include<iostream>
using namespace std;
class Base
{
    protected:
    int x;
    public:
    virtual void fun()=0;
    Base(int i)
    {
         int x=i;
           cout<<"i am from base class constructer"<<endl;
    }
};
class Derived:public Base
{
    int y;
    public:
    Derived(int i, int j):Base(i)
    {
        y=j;
    }
    void fun()
    {
        cout<<"x="<<x<<"y="<<y<<endl;
    }
};
int main(void)
{
    Derived d(5,10);
    d.fun();
    Base*ptr = new Derived(6,8);
    ptr->fun();
    return 0;

}