#include<iostream>
using namespace std;
int linearsearch(int arr[],int index ,int k)
{
    if(index<0)
    {
        return -1;
    }
    if(arr[index]==k)
    {
        return index;
    }
    int ans = linearsearch(arr,index-1,k);
    return ans;
}
int main()
{
    int arr[5] = {12,5,85,9,25};
    int size = 5;
    int k;
    cout<<"enter the element you want to search"<<endl;
    cin>>k;

    int ans = linearsearch(arr,size-1,k);

    if(ans==-1)
    {
        cout<<"element is not found"<<endl;

    }
    else{
        cout<<"element is found"<<endl;
    }
}