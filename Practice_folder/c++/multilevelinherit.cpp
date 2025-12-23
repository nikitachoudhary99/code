//c++ program to implement
//multilevel inheritence
#include<iostream>
//#include<bits/stdc++.h>
using namespace std;
//single base class
class A
{ 
  public:
int a;
void getAdata()
{
    cout<<"enter the value of a";
    cin>>a;
}
};
class B : public A 
{
    public:
    int b;
    void getBdata()
    {
        cout<<"enter the value of b";
        cin>>b;
    }
};

class C : public B
{
  private:
  int c;
  public:
  void getCdata()
  {
    cout<<"enter the value of c";
    cin>>c;
  }
  void sum()
  {
    int ans=a+b+c;
    cout<<"sum"<<ans<<endl;
  }
};
int main()
{
   C obj;
   obj.getAdata();
   obj.getBdata();
   obj.getCdata();
   return 0;
}

