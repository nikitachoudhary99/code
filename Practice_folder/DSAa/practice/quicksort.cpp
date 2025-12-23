//practice quick sort
#include<iostream>
int partion(int arr[],int s,int e)
{
    int pivot=arr[s];
    int i=s;
    int j=e;
    while(i<j)
    {
        while(arr[i]<=pivot && i<=e-1)
        {
            i++;
        }
        while(arr[j]>=pivot && j>s+1)
         {
            j--;
         }
         if(i<j)
         {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
         }
    }
    int temp=arr[j];
    arr[j]=arr[s];
    arr[s]=temp;
    return j;
}
void quicksort(int arr[],int s,int e)
{
    if(s>e)
    {
        return;
    }
    int part=partion(arr,s,e);
    quicksort(arr,s,part-1);
    quicksort(arr,part+1,e);
}
using namespace std;
int main()
{
    int arr[5]={5,3,8,9,6};
    int size=5;
    cout<<"array before sort"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
    quicksort(arr,0,size-1);
    cout<<"array after sort"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}