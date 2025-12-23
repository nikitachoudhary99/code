//multilevel inheritence
#include<iostream>
using namespace std;
class A
{
    public:
    void show()
    {
        cout<<"i am from A class"<<endl;
    }
};
class B:public A
{
    public:
    void display()
    {
        cout<<"i am from B class"<<endl;
    }
};
class C : public B
{
    public:
    void print()
    {
        cout<<"i am from C class"<<endl;
    }
};
int main()
{
    C obj;
    obj.show();
    obj.display();
    obj.print();
}