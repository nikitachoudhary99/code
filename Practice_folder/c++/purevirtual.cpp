//pure virtual function
#include<iostream>
using namespace std;
class Base
{
    public:
    virtual void show()
    {
        cout<<"i mam from base class"<<endl;
    }
};
class derived:public Base
{

    public:
    void show()
    {
        cout<<"i am from derived class"<<endl;
    }
};
int main()
{   derived d;
    Base *obj=&d;
   obj->show();


}
