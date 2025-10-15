#include<iostream>
using namespace std;
void bubbleSort(int arr[],int size)
{
  int i,j,temp;
  for(i=0;i<size;i++)
  {
    for(j=0;j<size-1;j++)
    {
        if(arr[j]<arr[j+1])
        {
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
  }
}
int main()
{
    int arr[5] = {8,2,3,4,5};
    int size = 5;

    cout<<"array before bubble function"<<endl;
    int i;
    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
    bubbleSort(arr,size);

    cout<<"array after bubble "<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
}