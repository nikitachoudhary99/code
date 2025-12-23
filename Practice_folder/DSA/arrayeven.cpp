//WAP to print all the values in array those value is even.
#include<iostream>
using namespace std;
int printeven(int arr[],int size)
{
  for(int i=0;i<size;i++)
  {
    if(arr[i]%2==0)
    {
        cout<<"even number"<<endl;
        cout<<arr[i]<<endl;
    }
    else
    {
        cout<<"odd number"<<endl;
        cout<<arr[i]<<endl;
    }
  }
  return 0;
}
int main()
{
 int arr[5];
 int size = 5;

 for(int i=0;i<size;i++)
 {
    cout<<"Enter the value"<<endl;
    cin>>arr[i];
 }
 printeven(arr,size);
    
}