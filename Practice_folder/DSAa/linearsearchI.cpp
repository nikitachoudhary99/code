//linear search for int
#include<iostream>
using namespace std;
bool linearsearch(int arr[],int size,int k)
{
    for(int i=0;i<size;i++)
    {
        if(arr[i]==k)
        return true;
    }
    return false;
}
int main()
{
    int arr[8]={1,23,45,56,79,90,91};
    int size=8;
    int k;
    cout<<"enter the element you want to found"<<endl;
    cin>>k;
    /*int ans=linearsearch(arr,size,k);
    if(ans==true)
    {
        cout<<"element found"<<endl;
    }
    else
    {
        cout<<"element not found";
    }*/
   linearsearch(arr,size,k);
   if(linearsearch(arr,size,k) ==true)
   {
    cout<<"element found"<<linearsearch(arr,size,k)<<endl;
   }
   else
   {
    cout<<"element not found"<<endl;
   }
}