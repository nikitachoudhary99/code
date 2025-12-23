//abstract 
#include<iostream>
using namespace std;


class shape
{
  public:
  virtual void draw()=0;

  virtual ~shape(){}
};

class circle:public shape
{
 public:
 void draw()
 {
    cout<<"drawing circle"<<endl;
 }
};
class square: public shape
{
  public:
  void draw()
  {
    cout<<"drawing square"<<endl;
  }
};
int main()
{
  shape *shape1 =new circle();
  shape *shape2=new square();

  shape1->draw();
  shape2->draw();
}