//friend class
#include<iostream>
using namespace std;
class Abc
{
    int x;
    public:
    Abc(int a)
    {
        x=a;
    }
    friend class Xyz;
};
class Xyz
{ 
    public:
   // Xyz(int a)
    void display(Abc &a1)
    {
    
        cout<<"value of x in Abc class "<<a1.x<<endl;
    }

};
main()
{
    Abc a1(15);
    Xyz obj;
    obj.display(a1);
    
  
}
