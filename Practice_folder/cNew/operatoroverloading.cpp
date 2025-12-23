//OPERATORS OVERloading
#include<iostream>
using namespace std;
class Abc
{
    public:
    int x;
    int y;
    Abc(int a, int b)
    {
        x=a;
        y=b;
    }
    void operator++()
    {
        x=x+10;
        y=y+12;
    }
};
int main()
{
    int y=30;
    ++y;
    Abc obj(40,30);
    ++obj;
    cout<<"value of y="<<y<<endl;
    cout<<"value of x="<<obj.x<<endl;
    cout<<"value of y="<<obj.y<<endl;
}
