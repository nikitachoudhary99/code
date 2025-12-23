//reverse an array
#include<iostream>
using namespace std;
int printarr(int arr[],int size)
{ 
    
    for(int i=0;i<size;i++)
    {
       cout<<arr[i]<<  " ";
       
    }
     
     cout<<endl;

} 
int reverse(int arr[],int n)
{
    for(int i=0;i<n/2;i++)
    {
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
    }
    return 0;

}


int main()
{
    int arr[8]={1,2,3,4,5,6,7,8};
    int size=8;
    cout<<"sorted array"<<endl;
    printarr(arr,size);
    
    reverse(arr,size);
    cout<<"reverse array"<<endl;
    
     printarr(arr,size);

}