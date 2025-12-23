//array short without 
#include<iostream>
using namespace std;
bool issort(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        if(arr[i]<arr[i-1])
        {
            return false;
        }
    }
    return true;
}
int main()
{
    int arr[5]={50,10,60,30,40};
    int size=5;
    if(issort(arr,size)==true)
    {
        cout<<"element are shorted "<<endl;
    }
    else
    {
        cout<<"element are not sorted"  <<endl;
    }
}