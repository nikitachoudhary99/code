#include<iostream>
using namespace std;
void display(int n)
{
    if(n>0)

    cout<<n<<" ";

    display(n-1);
}
int main()
{
    int n = 5;
    display(n);
}