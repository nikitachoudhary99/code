//bubble sort
#include<iostream>
using namespace std;
void bubblesort(int arr[],int size)
{  
    int i,j,temp;
    for(i=0;i<size-1;i++)
    {
        for(j=0;j<size-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

}
int main()
{
    int arr[]={20,6,0,40,30,450,45};
    int size=7;

    cout<<"array before sorting "<<endl;
    for(int i=0;i<size;i++)
    cout<<arr[i]<<" ";

    bubblesort(arr,size);
    
    
    cout<<"array after sorting "<<endl;
    for(int i=0;i<size;i++)
    cout<<arr[i]<<" ";


}