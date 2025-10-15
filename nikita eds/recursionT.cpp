//code showing tail recursion
#include<iostream>
using namespace std;
int find(int x) //recursion function
{
    if(x>0)

    cout<<" "<<x;

    find(x-1); //last statement in the function
}
int main()
{
    int x = 3;
    find(x);
    return 0;
}