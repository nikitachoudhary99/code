//function overlaoding
#include<iostream>
using namespace std;
class Add
{

public:
 void sum()
{
 int a = 10;
 int b = 20;
 int c = a+b;
 cout<<"sum1= "<<c<<endl; 
}
void sum(int a)
{
 int b = 40;
 int c = a+b;
 cout<<"sum2 = "<<c<<endl;
}
void sum(int a,int b)
{
 int c = a+b;
 cout<<"sum3 = "<<c<<endl;
}
};
int main()
{
    Add a1;
    a1.sum();
    a1.sum(40);
    a1.sum(50,50);
}