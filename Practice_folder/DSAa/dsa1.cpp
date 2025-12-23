#include<iostream>
using namespace std;
class Abc
{
    public:
    int x;
    int y;
    Abc()
    {
        x = 10;
        y = 20;
    }
};
int show(int x,int y)
{
 x++;
 y++;
 return x;
}
Abc print(Abc &obj)
{
    obj.x++;
    obj.y++;

    return obj;
}
int main()
{
    Abc obj;
    int x;
    int y;
    int ans = show(x,y);
    cout<<"value of x in show function = "<<obj.x<<endl;
    cout<<"value of y in show function = "<<obj.y<<endl;

    Abc a1 = print(obj);
    cout<<"value of x in print function = "<<obj.x<<endl;
    cout<<"value of y in printf function = "<<obj.y<<endl;
}