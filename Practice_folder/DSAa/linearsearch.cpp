//linear search
#include<iostream>
using namespace std;
int linearsearch(int arr[],int size,int k)
{ 
    for(int i=0;i<size;i++)
    {
        if(arr[i]==k)
        {
            return i;
        }
    }
    return -1;

}
int main()
{
    int arr[5]={1,2,3,4,5};
    int size=5;
    int k;
    cout<<"enter the value you want to search"<<endl;
    cin>>k;
   /* bool ans=linearsearch(arr,size,k );
    if(ans==true)
    {
        cout<<"element found"<<endl;
    }
    else
    {
        cout<<"element not found"<<endl;
    }*/
   linearsearch(arr,size,k);
   if(linearsearch(arr,size,k)==-1)
   {
    cout<<"element not found"<<endl;
   }
   else{
    cout<<"element found at index "<<linearsearch(arr,size,k)<<endl;
   }

}