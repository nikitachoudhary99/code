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
    int arr[5] = {1,2,3,4,5};
    int size = 5;
    int k;
    cout<<"Enter Element you want to search \n";
    cin>>k;

    int ans = linearsearch(arr,size-1,k);
    if(ans==-1)
    {
        cout<<"element not found"<<endl; 
    }
    else
    {
        cout<<"Element found at index\t"<<ans<<endl;
    }

}