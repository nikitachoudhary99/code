//embiguity error 
//inherite
#include<iostream>
using namespace std;
class A
{
    public:
    void a()
    {
      cout<<"i m from base class A"<<endl;
    }
};
class B
{
    public:
    void a()
    {
        cout<<"i m from base class B"<<endl;
    }
};
class C:public A, public B
{
   // public:
    //void a()
    //{
    //    cout<<"i m from derived class"<<endl;
    //}
};
int main()
{
    C obj;
    obj.a();
    
    return 0;
}
