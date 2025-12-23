#include<iostream>
using namespace std;
int binarySearch(int arr[],int s,int e,int k)
{
    if(s>e)
    {
        return -1;
    }
    int mid = (s+e)/2;
    if(arr[mid]==k)
    {
        return mid;
    }
    if(arr[mid]<k)
    {
        binarySearch(arr,mid+1,e,k);
    }
    else
    {
        binarySearch(arr,s,mid-1,k);
    }
    
}
int main()
{
    int arr[] = {12,15,19,21,23,27,29,31};
    int size = sizeof(arr)/sizeof(int);
    int k;
    cout<<"enter the element"<<endl;
    cin>>k;

    int res = binarySearch(arr,0,size-1,k);
    cout<<res<<endl;
}