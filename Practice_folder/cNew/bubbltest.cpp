//bubble sort
#include<iostream>
using namespace std;
 
 void bubblesort(int arr[],int size)
 {
    int i,j,temp;
    for(i=0;i<size-1;i++)
    {
        for(j=0; j < size -i -1;j++)
        { if(arr[j]<arr[j+1])
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
    int arr[6]={4,5,6,7,3,2};
    int size=6;
    int i;
    cout<<"array before sorting"<<endl;

    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    bubblesort(arr,size);
   
    cout<<"array after sorting"<<endl;
     for(i=0; i < size ;i++)
    {
        cout<< arr[i] << " " ;
    }
    cout<<endl;

 
    }