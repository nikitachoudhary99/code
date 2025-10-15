#include<iostream>
using namespace std;
int partition(int arr[],int s,int e)
{
    int pivot = arr[s];
    int i = s;
    int j = e;

    while(i<j)
    {
     while(arr[i]<=pivot && i<=e-1 )
     {
       i++;
     } 
     while(arr[j]>pivot && j>=s+1)
     {
        j--;
     }

     if(i<j)
     {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
     }       
    }
    int temp = arr[j];
    arr[j] = arr[s];
    arr[s] = temp;
    return j;
}
void quickSort(int arr[],int s,int e)
{
    if(s>e)
    {
      return;  
    }
     int part = partition(arr,s,e);
     quickSort(arr,s,part-1);
     quickSort(arr,part+1,e);
       
}
int main()
{
    int arr[8] = {10,3,18,6,7,15,21,14};
    int size = 8;
    cout<<"before quick sort"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;

    quickSort(arr,0,size-1);

    cout<<"after quick sort"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
}