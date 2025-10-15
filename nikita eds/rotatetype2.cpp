//rotate array second type
#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {2,4,6,8,10};
    int size = 5;
    int temp = arr[size-1];
    for(int i=size-2;i>=0;i--)
    {
        arr[i+1] = arr[i];
    }
    arr[0] = temp;

    cout<<"rotate array\n";

    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    
}