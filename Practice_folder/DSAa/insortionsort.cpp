//insertion sort
#include<iostream>
using namespace std;
void insersort(int arr[],int size)
{
    int i,j,temp;
    for(i=1;i<size;i++)
    {
        for(j=i;j>0;j--)
        {  if(arr[j]<arr[j-1])
            {
            temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            }
        }
    }
}
int main()
{
    int arr[]={2,6,8,9,4,5,6};
    int size=7;
    cout<<"array before sort"<<endl;
    for(int i=0;i<size;i++)
        {
            cout<<arr[i]<<"\t";
        }
     insersort(arr,size);  
    cout<<"array after sorting"<<endl;
     for(int i=0;i<size;i++)
     {
        cout<<arr[i]<<"\t";
     }
    
}