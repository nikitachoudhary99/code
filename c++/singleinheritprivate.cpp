//single inheritence for private class
#include<iostream>
using namespace std;
class parent
{
    private:
    int x;
};
class child: private parent
{
  public:
  int y;

  void setY(int a)
  {
    y=a;
    cout<<"value of y"<<y<<endl;
  }
void setX(int a)
    {   int x;
        x=a;
        cout<<"value of x"<<x<<endl;
    }
  
};
int main()
{
    child obj;
    obj.setX(50);
    obj.setY(60);

}