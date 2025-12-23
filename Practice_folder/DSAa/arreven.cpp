//array by user
#include<iostream>
using namespace std;
int display(int arr[],int size)
{
   for(int i=0;i<size;i++)
   {
     if(arr[i]%2==0)
     {
        cout<<"even number"<<endl;
        cout<<arr[i]<<endl;
     } 
     
}
return 0;
}
int main()
{
    int arr[5];
    int size=5;
    for(int i=0;i<size;i++)
    {
       cout<<"enter value"<<endl;
      cin>>arr[i];
    }
    display(arr,size);
}