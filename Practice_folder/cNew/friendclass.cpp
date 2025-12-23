//friend class
#include<iostream>
using namespace std;
class Abc
{
    int x;
    public:
    Abc(int a)
    {
        x=a;
    }
    friend class Xyz;
};
class Xyz
{
    int y;
    public:
    Xyz (int a)
    {
        y=a;
    }
    void display(Abc &a1)
    {
        cout<<"value of x in Abc class "<<a1.x<<endl;
    }
};
main()
{
    Abc a1(50);
    Xyz a2(20);
    a2.display(a1);
}