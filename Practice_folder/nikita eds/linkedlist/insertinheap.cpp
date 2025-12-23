#include<iostream>
using namespace std;
class Heap
{
    int arr[100];
    int size = 0;

    public:
    void insertionAtHeap(int data);
    void print();
};
void Heap::print( )
{
    for(int i=1;i<=size;i++)
    {
        cout<<arr[i]<<"\t";
    }
}
void Heap::insertionAtHeap(int data)
{
    size++;
    int index =  size;
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
int main()
{
    Heap maxHeap;

    maxHeap.insertionAtHeap(10);
    maxHeap.insertionAtHeap(30);
    maxHeap.insertionAtHeap(20);
    maxHeap.insertionAtHeap(50);
    maxHeap.insertionAtHeap(45);

    maxHeap.print();
}