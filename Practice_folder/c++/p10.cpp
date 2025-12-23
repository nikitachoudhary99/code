//print good morning if the time beetween 6am to 12 pm
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the value of n";
    cin>>n;
    if(n<=6)
    {
        cout<<"goodmorning";

    }
    else if(n>=12)
    {
       cout<<"not morning";
    }

}