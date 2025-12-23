//friend function common to two class 
//forword declaration
#include<iostream>
using namespace std;

class Abc;
class Xyz
{
    int x;
    int y;
    public:
    Xyz(int a)
   {
     y=a;
   }

    friend void  display(Abc &a1,Xyz &a2);
};
 class Abc
{
    int x;
    public:
    Abc (int a)
    {
        x=a;
    }
    friend void display(Abc &a1,Xyz &a2);
};
void display(Abc &a1,Xyz &a2)
{
    cout<<"value of x from Abc class"<<a1.x<<endl;
    cout<<"value of y from Xyz class"<<a2.y<<endl;
}
int main()
{
    Abc a1(10);
    Xyz a2(20);
    display(a1,a2);
}
