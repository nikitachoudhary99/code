//mathod overloading
#include<iostream>
using namespace std;
class calculator
{
    public:
    void sum()
    {
        int a=10;
        int b=20;
        int c=a+b;
        cout<<"sum="<<c<<endl;

    }
    void sum(int a)
    {
        int b=30;
        int c=a+b;
        cout<<"sum"<<c<<endl;

    }
    void sum(int a,int b)
    {
        int c=a+b;
        cout<<"sum ="  <<c<<endl;

    }
    void sum(int a,int b,int c)
    {
        int d=a+b+c;
        cout<<"sum"<<d<<endl;
    }
    
};
int main()
{
    calculator calc;
    calc.sum();
    calc.sum(30.2);
    calc.sum('B',20);
    calc.sum(20);
    calc.sum(10,20,30);
    calc.sum(10,30);
}