//selection shorts
#include<iostream>
using namespace std;
template<typename n>
void selsort(n arr[],int size)
{ 
    int i,j,min;
    n temp;
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
    string arr[5]={"nikita","aayushi","trapti","samaira","shakshi"};
    int size=5;
    cout<<"array before shorting\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
    selsort<string>(arr,size);
    cout<<"array after shorting\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}