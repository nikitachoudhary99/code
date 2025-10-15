//merge sort
#include<iostream>
using namespace std;
void merge(int arr[],int s,int mid,int e)
{
    int temp[e+1];
    int i=s;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=e)
    {
        if(arr[i]<=arr[j])
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        else if(arr[j]<arr[i])
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
    }
    if(i>mid)
    {
        while(j<=e)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
    }
    if(j>e)
    {
        while(i<=mid)
       { temp[k]=arr[i];
            i++;
            k++;
        }
    }
    k=0;
    for(int i= s; i <= e; i++)
    {
        arr[i]=temp[k];
        k++;
    }
}
void mergesort(int arr[],int s,int e)
{
    if(s>=e)
    {
        return;
    }
    int mid=(s+e)/2;
    mergesort(arr,s,mid);
    mergesort(arr,mid+1,e);
    merge(arr,s,mid,e);
}
int main()
{ 
   int arr[5]={1,3,5,11,9}; 
   int size=5;
   
    cout<<"array before sorting"<<endl;
   
   for(int i=0;i<size;i++)
   {
    cout<<arr[i]<<"\t";
   }
   mergesort(arr,0,size-1);
   cout<<"array after sorting"<<endl;
   for(int i=0;i<size;i++)
   {
    cout<<arr[i]<<"\t";
   }
}