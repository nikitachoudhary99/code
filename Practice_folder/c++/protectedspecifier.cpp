//protected specifire  when base class is private in single inheritence
#include<iostream>
using namespace std;
class A
{
    protected:
    int x=60;
    void show()
    {
        cout<<"the value of x in class A"<<x<<endl;
    }
};
class B: private A
{
     public:
     int y= 50;
     void display()
     {  
        cout<<"the value of y in class B"<<y<<endl;
     }
};
int main()
{
    B obj;
    obj.display();

}