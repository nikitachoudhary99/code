//selection shorting
#include<iostream>
using namespace std;
void selsort(int arr[],int size)
{
    int i,j,min,temp;
    for(i=0;i<size;i++)
    {
        min=i;
        //find minimum
        for(j=i+1;j<size;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
        //step 2
        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
}

 int main()
{
    int arr[8]={1,2,3,4,5,6,7,8};
    int size=8;
    for(int i=0;i<size;i++)
    {
        cout<<"\t"<<arr[i];
    }
     cout<<"\t"<<endl;
     selsort(arr,size);
     cout<<"array after short function\t";
     for(int i=0;i<size;i++)
     {
        cout<<"\t"<<arr[i]<<endl;
     }
cout<<"\t";
}