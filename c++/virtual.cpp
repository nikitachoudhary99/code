//virtual function
#include<iostream>
using namespace std;
class base
{
    public:
    virtual void show()
    {
        cout<<"i am from base class"<<endl;

    }
    void print()
    {
        cout<<"i am from base class"<<endl;
    }
};
class derived:public base
{
    public:
    void show()
    {
        cout<<"i am from derived class"<<endl;
    }
    
};
int main()
{
    derived d;
    base *obj=&d;
    obj->show();
    obj->print();
}