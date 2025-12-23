//maximum  next greater element in array by recursion
#include<iostream>
using namespace std;
void arraymax(int arr[],int index,int &max)
{
    if(index<0)
    {
        return;
    }
    if(arr[index]>max)
    {
        max=arr[index];
    }
    arraymax(arr,index-1,max);
}

int main()
{
    int arr[8]={10,20,30,70,50,60,80,65};
    int size=8;
    int max=0;
    arraymax(arr,size-1,max);
    cout<<max<<endl;
} 
