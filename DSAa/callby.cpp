//call bt value or call by refrence
#include<iostream>
using namespace std;
class Abc
{
    public:
    int x,y;
    Abc()
    {
        x=10;
        y=20;
    }
};
int show(int x,int y)
{
    x++;
    y++;
    return x;
}
Abc print(Abc &obj)//class ko return type and perameter pass
{
    obj.x++;
    obj.y++;
    return obj;
}
int main()
{
    abc.obj;
    int x,y;
    int ans=show(x,y)
    cout<<"value of x"<<obj.x<<endl;
     cout<<"value of y"<<obj.y<<endl;
     Abc a1=print(obj);
     cout<<"value of x"<<obj.x<<endl;
     cout<<"value of y"<<obj.y<<endl;



}