//bubble shorting 
#include<iostream>
using namespace std;

void bubbleshort(int arr[],int size)
{
    int i,j,temp;
    for(i=0;i<size-1;i++)
    {
        for(j=0;j<size-1;j++)
        {
            if(arr[j]<arr[j+1])
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
    int arr[8]={10,20,50,40,60,12,15,21};
    int size=8;
    int i;
    cout<<"array after shorting"<<endl;
    for(i=0;i<size;i++)
    cout<<arr[i]<<endl;
    bubbleshort(arr,size);
    
        cout<<"array after shorting"<<endl;
        for(i=0;i<size;i++)
        {
            cout<<arr[i]<<endl;
        }
    
}