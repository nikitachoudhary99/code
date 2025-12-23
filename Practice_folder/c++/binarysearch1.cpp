//binery search 
#include<iostream>
using namespace std;
int binarysearch(int arr[],int size,int k)
{
  int start=0;
  int end=size-1;
  while(start<=end)
  {
    int mid=start+end/2;
    if(k==arr[mid])
    {
        return 1;
    }
    else if(k<arr[mid])
    {
      end=mid-1;
    }
    else
    {
      end=mid+1;
    }
  }
  return 0;
}
int main()
{
  int arr[6]={1,2,3,4,5,6};
  int size=6;
  int k;
  cout<<"enter the value you want to search"<<endl;
  cin>>k;
  int res=binarysearch(arr,size,k);
  if(res==1)
  {
    cout<<"element found"<<endl;
  }
  else
  {
    cout<<"element not found"<<endl;
  }
}