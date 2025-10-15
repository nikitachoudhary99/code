//insertion using template 
#include<iostream>
using namespace std;
template<typename z>
void insersort(z arr[],int size)
{  
    int i,j;
    z temp;
    for(i=1;i<size;i++)
    {
        
        for(j=i;j>0;j--)
        {
         if(arr[j]<arr[j-1])
         {
            temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
         }
        }
    }
}
int main()
{
    int arr[10]={1,20,40,30,12,42,12,23,42,56};
    int size=10;
    cout<<"array before shorting"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
    insersort<int>(arr,size);
    cout<<"array after shorting"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    
}