//passing object
#include<iostream>
using namespace std;
class Abc
{
    public:
    int x;

};
void display(Abc a1)
{
    cout<<"value x in a1 object="<<a1.x <<endl;
}
int main()
{
    Abc a1;
    a1.x=30;
    display(a1);

}