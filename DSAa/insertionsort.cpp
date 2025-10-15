#include<iostream>
using namespace std;
void insertionSort(int arr[],int size)
{
    for(int i=1;i<size;i++)
    {
        int key = arr[i];
        int j = i-1;
        while(j>0 && arr[j]>key)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
void printArray(int arr[],int size)
{
    for(int i=1;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}
int main()
{
    int arr[] = {21,28,27,15,16,8,12,31,17};
    int size = 9;

    cout<<"before insertion sort"<<endl;
    printArray(arr,size);

    insertionSort(arr,size);

    cout<<"after insertion sort"<<endl;
    printArray(arr,size);
}