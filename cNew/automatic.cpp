//storage class in c in automatic keyword
#include<iostream>
using namespace std;
int main()
{
    int a=10;//using auto a=10;
    {
        int a=20;
        cout<<"value of a="<<a<<endl;
    }
}