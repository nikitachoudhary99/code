//cycle rotate arr//1,2,3,4,5
#include<iostream>
using namespace std;
 int reversearr(int arr[],int start,int end)
 {
    while(start<end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        return -1;
    }
 }
 int rotatearr(int arr[],int n,int d)
 {
    d=d%n;
    reversearr(arr,0,n-1);
    reversearr(arr,0,d-1);
    reversearr(arr,d,n-1);

 }
 int printarr(int arr[],int n)
 {
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
 }
 int main()
 {
    int d,n,arr,i;
    cout<<"enter the size of the aray";
    cin>>n;
    cout<<"enter the element of the array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"enter the element you want to rotate";
    cin>>d;
    rotatearr(arr,n,d);
    cout<<"array after rotation" <<d<<"cyclic rotation";
    printarr(arr,n);
    return 0;
 }