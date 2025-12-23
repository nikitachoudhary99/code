//friend function
#include<iostream>
using namespace std;
class Abc
{
    public:
    int x;
    Abc(int a)
    {
        x = a;
    }
 friend void display(Abc &a1);
};
 void display(Abc &a1)
{
 cout<<"value of x in Abc class "<<a1.x<<endl;
}
int main()
{
    Abc a1(50);
    display(a1);
}