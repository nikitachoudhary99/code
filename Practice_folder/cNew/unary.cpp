//uniary
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
    void operator--()
    {
        x=x+5;
        y=y-9;
    }
};
int main()
{
    int y=50;
    ++y;
    Abc obj(40,50);
    --obj;
    --obj;
    cout<<"value of x="<<obj.x<<endl;
    cout<<"value of y ="<<obj.y<<endl;
}
