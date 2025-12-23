//selection shorting
#include<iostream>
using namespace std;
void selshort(int arr[],int size)
{
    int i,j,min,temp;
    for(i=0;i<size;i++)
    {
        min=i;
        //find min
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
    int arr[8]={1,2,3,4,56,4,5,9};
    int size=8;
    int i;
    cout<<"array before shorting function\n"<<endl;
    for( i=0;i<size;i++)
    {
        cout<<arr[i]<<endl;
    }
    cout<<endl;
    selshort(arr,size);
    cout<<"array after shorting function"<<endl;
    for( i=0;i<size;i++)
    {
        cout<<arr[i]<<endl;
    }
    cout<<endl;
}