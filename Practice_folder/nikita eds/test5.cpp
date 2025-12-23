//function overridding
#include<iostream>
using namespace std;
class Base
{
    public:
    void show()
    {
      cout<<"I am from base class"<<endl;
    }
};
class  Derived:public Base
{
 public:
 void show()
 {
    cout<<"I am from Derived class";
 }
};
int main()
{
    Derived obj;
    obj.show();
}