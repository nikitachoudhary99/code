//binery operater
#include<iostream>
using namespace std;
class Abc
{
    public:
    int x;
    Abc(int a)
    {
        x=a;
    }
    int operator+(Abc &a2)
    {
        x=x*a2.x;
        return x;
    }
};
int main()
{
    int a=10;
    int b=50;
    int c=a+b;
    cout<<"value of c"<<c<<endl;
    Abc a1(10);
    Abc a2(20);

    int d= a1+a2;
    cout<<"value of d"<<d<<endl;

}