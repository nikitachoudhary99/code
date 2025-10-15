#include<iostream>
using namespace std;
void heapify(int arr[],int size,int i)
{
    int leftChild = 2*i;
    int rightChild = 2*i+1;
    int smallest = i;

    if(leftChild<=size && arr[leftChild]<arr[smallest])
    {
        smallest = leftChild;
    }
    if(rightChild<=size && arr[rightChild]<arr[smallest])
    {
        smallest = rightChild;
    }
    if(smallest!=i)
    {
        swap(arr[smallest],arr[i]);
        heapify(arr,size,smallest);
    }
}
void heapSort(int arr[],int size)
{
    for(int i=size/2;i>=1;i--)
    {
        heapify(arr,size,i);
    }

    int n = size;
    while(n>1)
    {
        swap(arr[n],arr[1]);
        n--;

        heapify(arr,n,1);
    }
}
int main()
{
    int arr[] = {-1,18,23,87,12,26,45,31,35,10};
    int size = 9;

    heapSort(arr,size);
    for(int i=1;i<=size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    
}