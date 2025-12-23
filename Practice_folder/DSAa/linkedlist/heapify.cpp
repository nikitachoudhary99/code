#include<iostream>
using namespace std;
void heapify(int arr[],int size,int i)
{
    int leftChild = 2*i+1;
    int rightChild = 2*i+2;
    int smallest = i;

    if(leftChild<size && arr[leftChild]<arr[smallest])
    {
        smallest = leftChild;
    }
    if(rightChild<size && arr[rightChild]<arr[smallest])
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

    for(int i=(size/2)-1;i>=0;i--)
    {
        heapify(arr,size,i);
    }

    int n = size;

    while(n>0)
    {
        swap(arr[n-1],arr[0]);
        n--;

        heapify(arr,n,0);
    }
}
int main()
{
    int arr[] = {44,17,13,12,21,24,26,31,18};
    int size = 9;

    heapSort(arr,size);

    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }

}
