//hierachical inheritence
#include<iostream>
using namespace std;
class A
{
    public:
    int a;
    void show()
    {
        cout<<"i am from class A"<<a<<endl;
    }    
};
class B:public A
{
    public:
    int b;
    void show1()
    {
        cout<<"i am from class b"<<b<<endl;
    }
};
class C : public A
{
    public:
    int c;
    void show2()
    {
        cout<<"i am from class c"<<c<<endl;
    }
};
class D :public B
{
    public:
    int d;
    void show3()
    {
        cout<<"i am from class D"<<d<<endl;
    }
};
class E :public B
{
    public:
    int e;
    void show4()
    {
        cout<<"i am from class E"<<e<<endl;
    }
};
class F:public C
{
     public:
     int f;
     void show5()
     {
        cout<<"i am from class f"<<f<<endl;
     }

};
int main()
{
  A obj;
  obj.a=10;
  obj.show(); 

  B obj1;
  obj1.b=20;
  obj1.show1();  

  C obj3;
  obj3.c=30;
  obj3.show2();
  
  D obj4;
  obj4.d=40;
  obj4.show3();

}