//refrance operater
#include<iostream>
using namespace std;
void display(int &x)
{
    x=x+5;
    cout<<"value of x in display"<<x<<endl;
}
int main()
{
    int x=10;
    cout<<"value of x in main"<<x<<endl;
    
}