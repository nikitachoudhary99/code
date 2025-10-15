#include<iostream>
using namespace std;

void selSort(int arr[],int size)
{
    for(int gap = size/2;gap>=1;gap=gap/2)
    {
        for(int i =gap;i<size;i++)
        {
            int key = arr[i];
            int j = i;
            while(j>=gap && arr[j-gap]>key)
            {
                arr[j] = arr[j-gap];
                arr[j-gap] = key;

                j=j-gap;
            }
        }
    }
}

void printArray(int arr[],int size)
{
    for(int i = 0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}
int main()
{
    int arr[7] = {18,21,23,15,12,19,27};
    int size = 7;

    cout<<"Array before sort"<<endl;
    printArray(arr,size);

    selSort(arr,size);

     cout<<"Array before sort"<<endl;
    printArray(arr,size);

}
