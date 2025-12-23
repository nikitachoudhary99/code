//selection shorts
#include<iostream>
using namespace std;
void selsort(int arr[],int size)
{ 
    int i,j,min,temp;
    for(i=0;i<size;i++)
    {
        min=i;
    
       for(j=i+1;j<size;j++)
         {
            if(arr[j]<arr[min])
              {
                min=j;
              }
         }
         temp=arr[i];
         arr[i]=arr[min];
         arr[min]=temp;
    }
}
int main()
{
    int arr[5]={1,52,23,4,5};
    int size=5;
    cout<<"array before shorting\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
    selsort(arr,size);
    cout<<"array after shorting\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}