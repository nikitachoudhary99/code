//wap to swap without using third variable
#include<iostream>
using namespace std;
int main()
{
    int a=20,b=40;
    cout<<"value of a and b before swaping="<<a <<endl <<b <<endl;
    a=a+b;
    b=a-b;
    a=b-a;
    cout<<"value of a and b after swaping="<<a  <<endl <<b <<endl;
}