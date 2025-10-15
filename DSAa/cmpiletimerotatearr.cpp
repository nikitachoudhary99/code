//rotate array in compile time
#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {1,2,3,4,5};
    int size = 5;
    int temp = arr[size-1];
    for(int i=size-1;i>0;i--)
    {
        arr[i] = arr[i-1];
    }
    arr[0] = temp;

    cout<<"array rotate in one time\n";
    for(int i=0;i<size;i++)
    {
      cout<<arr[i]<<" ";
    }
} 