//public specifire in single inheritence
#include<iostream>
using namespace std;
class base
{
    public:
    int x=20;
    void show()
    {
        cout<<"the value x in base class"<<x<<endl;
    }
};
class derived : public base
{
   public:
   int y=30;
   void display()
   {
    cout<<"the value of y in derived class"<<y<<endl;
   }
};
int main()
{
    derived obj;
   // int x=20;
    //int y=30;
    obj.show();
    obj.display();
}