//linearsearch
#include<iostream>
using namespace std;
  linearsearch(int arr[],int size,int k)
  {
    int i;
    for(i=0;i<size;i++)
    {
        if(arr[i]==k)
        {
            return i;
        }
        return -1;
    }
  }
int main()
{
    int arr[5]={4,5,6,7,8};
    int size=5;
    int k;
    cout<<"ener the element you want to search"<<endl;
    cin>>k;
    linearsearch(arr,size,k);
    if(  linearsearch(arr,size,k)==-1)
    {
        cout<<"element found at index"<<linearsearch(arr,size,k)<<endl;
    }
    else
    {
        
        cout<<"element not found"<<endl;
        
    }
    return 0;
}