//rotate array with the help of function
#include<iostream>
using namespace std;
int rotate(int arr[],int size)
{
 int temp = arr[size-1];

 for(int i=size-1;i>0;i--)
 {
    arr[i] = arr[i-1];
 }
 arr[0] = temp;
}
int print(int arr[],int size)
{
cout<<"rotate array: ";
 for(int i=0;i<size;i++)
 {
    cout<<arr[i]<<" ";
 }
 cout<<endl;
}
int main()
{
  int arr[5];
  int size = 5;
  for(int i=0;i<size;i++)
  {
    cout<<"enter the value\n";
    cin>>arr[i];
  }
  rotate(arr,size);
  print(arr,size);
}