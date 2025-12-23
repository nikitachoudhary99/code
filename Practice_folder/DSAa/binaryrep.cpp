//binary repeat 
#include<iostream>
using namespace std;
int binary(int arr[],int k)
{
    int s=0;
    int e=arr.size()-1;
    int index=-1;
    while(s<=e)
    {
        int mid=(s+e)/2;
        if(arr[mid]==k)
         {
            return mid;
            e=mid-1;
         }
         else if(arr[mid]<k)
         {
            s=mid+1;
            index=mid;
         }
         else
         {
           e=mid-1;
         }
      
    }
      return index;
}
int main()
{
    int arr={1,3,5,7,9,11,13,14};
    int k;
    cout<<"enter the element"<<endl;
    cin>>k;
    int index=binary(arr,k);
    if(index!=-1)
    {
        cout<<"first occ "<<k<<"is at index"<<index<<endl;
    }
    else{
        cout<<k<<"not found"<<endl;
    }
    return 0;
}