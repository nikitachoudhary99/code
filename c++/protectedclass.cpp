//protected class public inherit
#include<iostream>
using namespace std;
class base
{
    protected:
    int x=10;
    void show()
    {
        cout<<"the value of x in class base"<<x<<endl;

    }
};
class derived: public base
{
    public:
    int y=20;
    void display()
    {
        cout<<"the value of y in derived class"<<y<<endl;
    }
};
int main()
{
    derived obj;
    obj.display();
}