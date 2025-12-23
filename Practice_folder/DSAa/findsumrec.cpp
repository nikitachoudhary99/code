//recursive function to find the sum of number from 0 to n
#include<iostream>
using namespace std;
int findsum(int n)
{
    //base case
    if(n==0)
    
    return 0;

    //recursion case
    return n + findsum(n-1);

}
int main()
{
    int n = 5;
    //findsum(n);
    cout<<"sum = "<<findsum(n)<<endl;
    return 0;
}