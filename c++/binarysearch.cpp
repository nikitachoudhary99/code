//binery search by templates
#include<iostream>
using namespace std;
template<typename t>
bool binarysearch(t arr[],int size,t k)
{
    int s=0;
    int e=size-1;
    while(s<=e)
    {  int mid=(s+e)/2;
        if(k==arr[mid])
        {
            return true;
        }
        else if(k<arr[mid])
        {
            e=mid-1;
        }
        else
        {
            s=mid+1;
        }
    } 
    return false;

}
int main()
{
    int arr[5]={1,2,3,4,5};
    int size=5;
    int k;
    cout<<"what you want to search"<<endl;
    cin>>k;
    

    bool result=binarysearch<int>(arr,size,k);
    if(result==true)
    {
        cout<<"element found";
    }
    else
    {
        cout<<"element not found";
    }
}