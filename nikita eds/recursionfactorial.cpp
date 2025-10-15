//find the factorial using recursion
#include<iostream>
using namespace std;
int fact(int n)
{
    if(n==1)
    {
        return 1;
    }
    int ans = n*fact(n-1);
    return ans;
}
int main()
{
    int n;
    cout<<"enter the value"<<endl;
    cin>>n;

    int ans = fact(n);
    cout<<"ans = "<<ans<<endl;
}