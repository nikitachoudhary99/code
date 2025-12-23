#include<iostream>
using namespace std;
int fib(int n)
{
    if(n<=1)
    {
        return 0;
    }
    if(n==2)
    {
        return 1;
    }

    int res = fib(n-1) + fib(n-2);
    return res;
}
int main()
{
    int n;
    cout<<"enter the value of n"<<endl;
    cin>>n;

    int res = fib(n);
    cout<<"fib term = "<<res<<endl;
}