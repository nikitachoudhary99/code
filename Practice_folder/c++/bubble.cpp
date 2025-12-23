//bubble sort by template
#include<iostream>
using namespace std;
template<typename n>
void bubblesort(n arr[],int size)
{
    int i,j;
    n temp;
    for(i=0;i<size;i++)
    {
        for(j=0;j<size-1;j++)
        {
            if(arr[j]<arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int main()
{
    int arr[10]={1,20,42,12,3,13,50,56,40,10};
    int size=10;
    cout<<"array before shorting"<<endl;
     for(int i=0;i<size;i++)
     {
        cout<<arr[i]<<"\t";
     }
     cout<<endl;
     bubblesort<int>(arr,size);
     cout<<"array after shorting\n";
     for(int i=0;i<size;i++)
     {
        cout<<arr[i]<<"\t";
     }
     cout<<endl;
}