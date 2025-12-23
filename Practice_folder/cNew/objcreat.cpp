//wap to count number of obj created of the class
#include<iostream>
using namespace std;
class Abc
{
    public:
    static int count;
  Abc()
  {
    count++;
  }

};
int Abc::count=0
int main()
{
    Abc a1;
    Abc a2;
    Abc a3;
    cout<<"count of total object created"<<a1.count<<endl;
    //or //cout<<"count of total object created"<<Abc::count<<endl;
    //or// Abc.show();
}