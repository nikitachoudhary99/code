#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {5,10,21,85,1};
    int size = 5;

    int max = 0;
    int min = 0;

    for(int i=0;i<size;i++)
    {
        if(arr[i]>arr[max])
    {
        max = i;
    }
    else if(arr[i]<arr[min])
    {
        min = i;
    }
    }
    cout<<"maximum value in array\t"<<arr[max]<<endl;
    cout<<"manimum value in array\t"<<arr[min]<<endl;
    
}