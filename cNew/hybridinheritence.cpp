//dimond shape ambiguity
//hybrid inheritence
#include<iostream>
using namespace std;
class grand
{
    public:
    int x;
    void show()
    {
        cout<<"i am from grand class"<<endl;
    }
};
class parent1: public grand
{
    public:
    void show1()
    {
        cout<<"i am from parent 1 clsss"<<endl;
    }
};
class parent2 : public grand
{
    public:
    void show2()
    {
        cout<<"i am from parent 2 class"<<endl;
    }
};
class child: public parent1, public parent2
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
    obj.show1();
    obj.show2();
    obj.show3();
    obj.show4();
    obj.x=20;
}
