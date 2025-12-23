//binary pra
#include<iostream>
using namespace std;
int binarysearch(int arr[],int size,int k)
{
    int s=0;
    int e=size-1;
    while(s<=e)
    {
        int mid=(s+e)/2;
        if(k=arr[mid])
        {
            return 1;
        }
        else if(k<arr[mid])
        {
            e=mid-1;
        }
        else
        {
            e=mid+1;
        }
        return 0;
    }
}
int main()
{
    int arr[6]={1,2,3,4,5,6};
    int size=6;
    int k;
    cout<<"enter the element you want to found"<<endl;
    cin>>k;
     binarysearch(arr,size,k);
    if(binarysearch(arr,size,k)==1)
    {
        cout<<"element found  "<<endl;
    }
    else
    {
        cout<<"element not found"<<endl;
    }
}