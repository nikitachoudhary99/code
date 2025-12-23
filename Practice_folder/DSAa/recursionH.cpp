//code showing head recursion
#include<iostream>
using namespace std;
void find(int n) //recursion function
{
    if(n>0)

    find(n-1); //first statement in the function

    cout<<" "<<n;
}
int main()
{
    int x =3;
    find (x);

    return 0;
}