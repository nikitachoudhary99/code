//binary search
#include<iostream>
using namespace std;

bool binarysearch(int arr[],int size,int k)
{
    int s=0;
    int e=size-1;
    while(s<=e)
    {
        int mid=(s+e)/2;
        if(k==arr[mid])
        {
            return true;
        }
        else if(k<=arr[mid])
        {
            e=mid-1;
        }
        else
        {
           e=mid+1;
        }

    }
    return false;
}
int main()
{
    int arr[6]={1,2,3,4,5,6};
    int size=6;
    int k;
    cout<<"enter the value you want to search"<<endl;
    cin>>k;
   
   
    bool result=binarysearch(arr,size,k);
    if(result==true)
    {
        cout<<"element found"<<endl;
    }
    else
    {
        cout<<"element not found"<<endl;
    }
}