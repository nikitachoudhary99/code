//linear search
#include<iostream>
using namespace std;
int linearsearch(int arr[],int size,int k)
{
    int i;
    for(i=0;i<size;i++)
    {
        if(arr[i]==k)
        {
            return i;
        }
     
    }
       return -1;
}
    int  main()
    {
        int arr[5]={1,2,3,4,5};
        int size=5;
        int k;
        cout<<"enter the element you want to found"<<endl;
        cin>>k;
        int ans=linearsearch(arr,size,k);
        
            if(ans==-1)
            {
                cout<<"element not found"<<endl;
            }
            else
            {
                cout<<"element found at index  " << ans<<endl;
            }
        
    }
