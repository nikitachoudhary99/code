//binarysearch by template function
#include<iostream>
using namespace std;
template<typename T>
bool binarysearch(T arr[],int size,T k)
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
    cout<<"enter the element you want to search"<<endl;
    cin>>k;

   bool res =binarysearch<int>(arr,size,k);
   if(res==true)
   {
    cout<<"element is found"<<endl;
   }
   else
   {
    cout<<"element is not found"<<endl;
   }

}