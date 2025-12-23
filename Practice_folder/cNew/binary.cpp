
//binary search
#include<iostream>
using namespace std;
int binarysearch(int arr[],int size,int k)
{
    int size=0;
    int element=size-1;
    while(size<=element)
    {
        int middle=(size+element)/2;
        if(k==arr[middle])
        {
            return 1;
        }
        else if(k<arr[middle])
        {
            element=middle-1;
        }
        else
        {
         size=middle+1;
        }
        return 0;
    }
    void main()
    {
        int arr[5]={1,2,3,4,5};
        int size=5;
        int k;
        cout<<"enter the value you want to search"<<k<<endl;
        int res=binarysearch(arr,size,k);
        if(res==1)
        {
            cout<<"element found"<<endl;
        }
        else
        {
            cout<<"element not found"<<endl;
        }
    }
}
    
