#include<iostream>
using namespace std;
void display(int n)
{
    if(n>0)

    display(n-1);

    cout<<n<<" ";
}
int main()
{
    int n = 5;
    display(n);

}