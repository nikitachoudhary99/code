#include<iostream>
using namespace std;
void bubblesort(int arr[],int size)
{
    int i,j,temp;
    for(i=0;i<size;i++)
    {
        for(j=0;j<size-1;j++)
        {
            if(arr[j]>arr[j+1])
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
    int arr[5] = {8,2,9,4,3};
    int size = 5;

    cout<<"array before bubble function\n";
    int i;
    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;

    bubblesort(arr,size);
    cout<<"array after bubble function\n";

    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}