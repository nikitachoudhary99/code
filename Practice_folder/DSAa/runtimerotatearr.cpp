/rotate array run time
#include<iostream>
using namespace std;
int main()
{
    int arr[6];
    int size = 6;
    int temp;

    for(int i=0;i<size;i++)
    {
        cout<<"enter the value\n";
        cin>>arr[i];
    }
    temp = arr[size-1];
    for(int i=size-1;i>0;i--)
    {
        arr[i] = arr[i-1];
    }
    arr[0] = temp;

    cout<<"rotate array\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
        
    }
    cout<<endl;
}