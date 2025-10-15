#include<bits/stdc++.h>
using namespace std;
class Heap
{
    int arr[100];
    int size = 0;

    public:
        void insertAtHeap(int data);
        void print();
        int deletefromHeap();
};
void Heap::insertAtHeap(int data)
{
    size++;
    int index = size;
    arr[index] = data;

    while(index>1)
    {
        int parent = index/2;

        if(parent>=1 && arr[index]>arr[parent])
        {
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;

            index = parent;
        }
        else
        {
            return;
        }
    }
}
void Heap::print()
{
    for(int i=1;i<=size;i++)
    {
        cout<<arr[i]<<"\t";
    }
}
int Heap::deletefromHeap()
{
    int temp = arr[size];
    arr[size] = arr[1];
    arr[1] = temp;

    size--;
    int i = 1;
    while(i<=size)
    {
        int leftChild = 2*i;
        int rightChild = 2*i+1;
        int largest = i;

        if(leftChild<=size && arr[largest]<arr[leftChild])
        {
            largest = leftChild;
        }
        if(rightChild<=size && arr[largest]<arr[rightChild])
        {
            largest = rightChild;
        }
        if(largest!=i)
        {
            swap(arr[i],arr[largest]);
            i = largest;
        }
        else
        {
            break;
        }
    }
    return arr[size+1];
}
int main()
{
    Heap maxHeap;

    maxHeap.insertAtHeap(10);
    maxHeap.insertAtHeap(30);
    maxHeap.insertAtHeap(20);
    maxHeap.insertAtHeap(50);
    maxHeap.insertAtHeap(45);
    maxHeap.insertAtHeap(70);
    maxHeap.insertAtHeap(65);
    maxHeap.insertAtHeap(80);

    maxHeap.print();
    cout<<endl;

    int maxElement = maxHeap.deletefromHeap();
    cout<<maxElement<<endl;

    maxHeap.print();
    cout<<endl;

    maxElement = maxHeap.deletefromHeap();
    cout<<maxElement<<endl;

    maxHeap.print();
    cout<<endl;

}