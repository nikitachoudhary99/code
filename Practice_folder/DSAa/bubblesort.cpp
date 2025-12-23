//bubble sort
#include<iostream>
using namespace std;
void bubblesort(int arr[],int size)
{
    int i ,j,temp;
    for(i=0;i<size-1;i++)
    {
        for(j=0;j<size-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
int main()
{
    int arr[]={10,2,50,60,80,10,20,30};
    int size=8;

    cout<<"array before sort"<<endl;
    for(int i=0;i<size;i++)
    cout<<arr[i]<<" ";
    bubblesort(arr,size);
    cout<<"array after sort"<<endl;
    for(int i=0;i<size;i++)
    cout<<arr[i]<<" ";
}