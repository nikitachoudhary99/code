//binary by using template for string
#include<iostream>
using namespace std;
template<typename n>
bool binarysearch(n arr[],int size,n k)
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
        else if(k<arr[mid])
        {
            e=mid-1;
        }
        else{
            s=mid+1;
        }
    }
    return false; 
}
int main()
{
    string arr[5]={"nikita","nik","sum","tu","zuu"};
    int size=5;
    string k;
    cout<<"what you want to search"<<endl;
    cin>>k;
    bool res=binarysearch<string>(arr,size,k);
    if(res==true)
    {
        cout<<"element found"<<endl;
    }
    else
    {
        cout<<"element not found"<<endl;
    }
}