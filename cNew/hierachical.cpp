//hierachical inheritence
#include<iostream>
using namespace std;
class A
{
    public:
    void show1()
    {
        cout<<"i am from base class A"<<endl;
    }
};
class B:public A
{
    public:
    void show2()
    {
        cout<<"i am from base class B"<<endl;
    }
};
class C:public A
{
  public:
  void show3()
  {
    cout<<"i am from base class C"<<endl;
  }
};
class D:public B
{
    public:
    void show4()
    {
        cout<<"i am from base class D "<<endl;
    }
};
class E:public B
{
    public:
    void show5()
    {
        cout<<"i am from base class E "<<endl;
    }
};
class F: public C
{
    public:
    void show6()
    {
        cout<<"i am from base class F "<<endl;
    }
};
class G:public C
{
    public:
    void show7()
    {
        cout<<"i am from class G "<<endl;
    }
};
int main()
{  
   G obj;
   obj.show7();
   obj.show3();
   obj.show1();

   F obj1;
   obj1.show6();
   obj1.show3();
   obj1.show1();


    E obj2;
    obj2.show5();
    obj2.show2();
    obj2.show1();

    D obj3;
    obj3.show4();
    obj3.show2();
    obj3.show1();

    C obj4;
    obj4.show3();
    obj.show1();
    
     F obj5;
     obj5.show6();
     obj5.show3();
     obj.show1();

     B obj6;
     obj6.show2();
     obj6.show1();


}