//insertion short
#include<iostream>
using namespace std;
void insort(int arr[],int size)
{
    int i,j,temp;
    for(i=1;i<size;i++)
    {
        for(j=1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
}
void mergeArray(int arr1[],int size1,int arr2[],int size2,int arr3[])
{
    int i,k=0;
    for(i=0;i<size;i++)
    {
        arr3[k]=arr1[i];
        k++;
    }
}
void display(int arr3[],int size3)
{
    int i;
    for(i=0;i<size3;i++)
    {
        cout<<"\t"<<arr3[i];

    }
}
void main()
{
    int arr1[5]={3,4,5,6,8};
    int size=5;

    int arr2[7]={1,2,3,4,5,6,7};
    int size=7;

    int arr3[12];
    int size=12;
    mergeArray(arr1,size1,arr2,size2,arr3);
    inssort(arr3,size3);
    display(arr3,size3);
}