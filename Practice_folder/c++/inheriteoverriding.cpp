//inherite overriding
#include<iostream>
using namespace std;
class parent
{
  public:
  
  void show()
  { 
    cout<<"i m from show function"<<endl;
    
  }
};
class child:public parent
{    
public:    
 void print()
  { 
    cout<<"i m from print function"<<endl;
    
  }

};
int main()
{
  child obj;
  obj.show();
  obj.print();
}