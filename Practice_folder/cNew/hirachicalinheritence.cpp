//what is inheritence and its typees with an example show herichical inheritence?
/*



*/
//hirachical inheritence
#include<iostream>
using namespace std;

class A
{
    public:
    void show1()
    {
        cout<<"i am from base class"<<endl;
    }
};

class B:public A
{
    public:
    void show2()
    {
        cout<<"i am from derived 1 class"<<endl;
    }
};

class C:public A
{
    public:
    void show3()
    {
        cout<<"i am from derived 2 class"<<endl;
    }
};

class D:public B
{
    public:
    void show4()
    {
        cout<<"i am from D class"<<endl;
    }
};

class E:public C
{
    public:
    void show5()
    {
        cout<<"i am from E class"<<endl;
    }
};

int main()
{
    E obj;
    obj.show5();
    obj.show3();
    obj.show1();

    D obj1;
    obj1.show1();
    obj1.show2();
    
}
