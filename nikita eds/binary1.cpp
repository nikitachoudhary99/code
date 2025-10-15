#include<iostream>
using namespace std;
bool binarysearch(int arr[],int size,int k)
{
 int s = 0;
 int e = size-1;
 while(s<=e)
 {
   int mid = (s+e)/2;
    if(arr[mid]==k)
    {
        return true;
    }
    else if(arr[mid]<k)
    {
        s = mid+1;
    }
    else
    {
        e = mid-1;
    }
 }
 return false;
}
int main()
{
    int arr[5] = {2,4,6,8,10};
    int size = 5;
    int k;
    cout<<"enter the elemnt you want to search\n";
    cin>>k;
    bool ans =binarysearch(arr,size,k);
    if(ans==true)
    {
        cout<<"element is found\n"<<endl;
    }
    else
    {
        cout<<"element is not found\n"<<endl;
    }
}