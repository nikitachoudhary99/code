//inheritence
//single inheritence
#include<iostream>
using namespace std;
class base
{
    public:
    int x;
    void setX(int a)
    {
     x=a;
     cout<<"value of x"<<x<<endl;
    }
};
class derive:public base
{
  public:
  int y;
  void setY(int a)
  {
    y=a;
    cout<<"value of y"<<y<<endl;
  }
  
};
int main()
{
 derive obj;
 obj.setX(20);
 obj.setY(30);   
}