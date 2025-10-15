//there are only one type of distructor -->>default 
//Default destructor
#include<iostream>
using namespace std;
class Abc
{
   public:
   Abc()
   {
    cout<<"constructor invoked"<<endl;
   }
   ~Abc()
   {
    cout<<"destrocter invoked"<<endl;
   }

};

main()
{
    Abc a1;
    Abc a2;
    cout<<"Hello"<<endl;
}