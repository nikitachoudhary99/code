//dimond shap ambiguity
#include<iostream>
using namespace std;
class grand
{
   public:
   void show()

   cout<<"i am from grand class"<<endl;
};
class parentA: public grand
{
    public:
    void show1()
    cout<<"i am from base class A"<<endl;
};
class parentB:public grand
{                                               //when we want to resolve dimond shap ambiguity use virtual;
                                                 
    public:
    void show2()
    cout<<"i am from base class B"<<endl;
};
class child:public parentA,public parentB
{
    public:
    void show3()
    cout<<"i am from child class"<<endl;
};
int main()
{
    child obj;
    obj.show();
    obj.show2();
    obj.
}
