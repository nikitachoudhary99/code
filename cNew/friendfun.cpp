//friend function common to 2 class
//forword declaraction
#include<iostream>
using namespace std;
class Abc;
class xyz
{
  int x;
  int y;
  public:
  xyz(int a,int b)
  {
    
    y=b;
  }

friend void display(Abc &a1,xyz &a2);
};
class Abc
{  
    int x;
    public:
    Abc(int a)
    {
        x=a;
    }

    friend void display(Abc &a1,xyz &a2);
    
};
friend void display(Abc &a1,xyz &a2)
{
    cout<<"value of x from Abc"<<a1.x<<endl;
    cout<<"value of y from xyz"<<a2.y<<endl;
}
int main()
{
    Abc a1(50);
    xyz a2(60);
    display(a1,a2);
}
