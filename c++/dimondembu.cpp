//explan dimond shape embuguity 
/*
when there is a derive class that is inherite with more then one base class and base class share common enssestor
we use virtual keyword ;

*/
#include<iostream>
using namespace std;

class grand
{
    public:
    void show()
    {
        cout<<"i am from base class"<<endl;
    } 
};
class parent1: public  virtual grand
{
    public:
    void show1()
    {
        cout<<"i am from derived 1 class"<<endl;
    }

};
class parent2:public  virtual grand
{
    public:
    void show2()
    {
        cout<<"i am from derived 2 class"<<endl;
    }
};
class child: public parent1,parent2
{
    public:
    void show4()
    {
        cout<<"i am from child class"<<endl;
    }
};
int main()
{
    child obj;
    obj.show();
    obj.show1();
}
