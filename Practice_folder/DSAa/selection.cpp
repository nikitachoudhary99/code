#include<iostream>
using namespace std;
void selSort(int arr[],int size)
{
 int i,j,min,temp;
 for(i=0;i<size;i++)
 {
    min = i;
    for(j=i+1;j<size;j++)
    {
        if(arr[j]<arr[min])
        {
            min = j;
        }
    }
    temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
 }
}
int main()
{
    int arr[8] = {2,6,3,10,27,22,1,15};
    int size = 8;
   int i;
   cout<<"array before sorting";

   for(i=0;i<size;i++)
   {
    cout<<arr[i]<<"\t";
   }
   cout<<endl;
   cout<<"array after sorting";
   for(i=0;i<size;i++)
   {
    cout<<arr[i]<<"\t";
   }
   cout<<endl;
}