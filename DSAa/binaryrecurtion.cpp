//binary by recurtion
#include<iostream>
using namespace std;
int binarysearch(int arr[],int s,int e,int k)
{  
    if(s>e)
    {
        return -1;
    }
    int mid=(s+e)/2;
    if(arr[mid]==k)
    {
        return mid;
    }
    if(arr[mid]<k)
    {
        binarysearch(arr,mid+1,e,k);
    }
    else
    {
      binarysearch(arr,s,mid-1,k);  
    }

}
int main()
{
    int arr[]={12,13,45,65,67,85,95};
    int size=sizeof(arr)/sizeof(int);
    int k;
    cout<<"enter element"<<endl;
    cin>>k;
    int res=binarysearch(arr,0,size-1,k);
    cout<<res<<endl;
}
