//friend function  for for two values
#include<iostream>
using namespace std;
class Abc
{
    int x;
    public:
    int y;
    Abc(int a, int b)
{
x=a;
y=b;
}
friend void display(Abc &a1 ,Abc &a2);
};
void display (Abc &a1 , Abc &a2) 
{
    cout<<"value of x Abc class"<<a1.x<<endl;
    cout<<"value of y Abc class"<<a2.x<<endl;

}
int main()
{
    Abc a1(10,20);
    Abc a2(20,20);
    display(a1,a2);
}

