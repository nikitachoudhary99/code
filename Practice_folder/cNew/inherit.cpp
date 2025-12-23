#include<iostream>
using namespace std;
class A
{
   private:
   int a=1;
   protected:
   int b=2;
   public:
   int c=3;
   A(int x,int y,int z)
   {
     a=x;
     b=y;
     c=z;

   }
};
class B:public A
{
    public:
    int j=10;
   B()
   {
      cout<<"value of j"<<j<<endl;
   }
};
int main()
{

    A obj(10,20,30);
     B obj1(10,20,30);


}