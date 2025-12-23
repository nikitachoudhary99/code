//bubble sorting
#include<iostream>
using namespace std;
void swap(int* arr,int i,int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

}
void bubblesort(int arr[],int n)
{
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            swap(arr,j,j+1);
        }
    }
}
int main()
{   int size;
    int arr[]={1,2,3,4,5,6,7,8,9,10,11};
    int n;
    bubblesort(arr,n);
    for(int i=0;i<n;i++)
    cout<<"\t"<<arr[i];
    return 0;

}