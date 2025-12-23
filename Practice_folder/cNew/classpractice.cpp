//
#include<iostream>
using namespace std;
class super
{
  private:
  int x;
};
class sub: private super
{
   public:
   void setX(int a)
    { 
     int x;   
     x=a;
    cout<<"value of x"<<x<<endl;
   }
};
int main()
{
    sub obj;
    obj.setX(50);
}