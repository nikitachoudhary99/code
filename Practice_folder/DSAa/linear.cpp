//linearsearch
#include<iostream>
using namespace std;
linearsearch(int arr[],int size,int k)
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
    int arr[]={10,2,03,04,5,60};
    int size=6;
    int k;
    cout<<"enter the value you want to search"<<endl;
    cin>>k;
    linearsearch(arr,size,k);
    if(linearsearch(arr,size,k)==-1)
    {
        cout<<"element not found"<<endl;
    }
    else
    {
        cout<<"element found"<<endl;
    }
}