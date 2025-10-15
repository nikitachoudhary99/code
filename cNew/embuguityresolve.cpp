//embiguity error resolve 
#include<iostream>
using namespace std;
class A
{
    public:
    void show()
    {
        cout<<"show functionin class A"<<endl;
    }
};
class B
{
    public:
    void show()
    {
        cout<<"show function in class B"<<endl;
    } 
};
class C:public A ,public B
{
    public:
    void show()
    {
        cout<<"show function in derived class"<<endl;
    }
};
int main()
{
    C obj;
    obj.A::show();
    obj.B::show();
}
