#include<iostream>
using namespace std;
int getMax(int arr[],int size)
{
    int m = arr[0];
    for(int i =1;i<size;i++)
    {
        if(arr[i]>m)
        {
            m = arr[i];
        }
    }
    return m;
}
void countSort(int arr[],int size,int ex)
{
    int count[10] = {0};

    //placing each value of array to count array by its most significiant digit
    for(int i=0;i<size;i++)
    {
        int index = (arr[i]/ex)%10;
        count[index]++;
    }

    //to calculate sum
    for(int i=1;i<10;i++)
    {
        count[i] = count[i] + count[i-1];
    }

    int output[size];

    for(int i=size-1;i>=0;i--)
    {
        int index = (arr[i]/ex)%10;
        output[count[index]-1] = arr[i];
        count[index]--;
    }

    for(int i=0;i<size;i++)
    {
        arr[i] = output[i];
    }
}
void radixSort(int arr[],int size)
{
    int maxi = getMax(arr,size);

    for(int ex =1;maxi/ex>0;ex = ex*10)
    {
        countSort(arr,size,ex);
    }
}
void printArray(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
}
int main()
{
    int arr[] = {21,802,27,5,66,8,122,31,17};
    int size = 9;

    cout<<"before sorting"<<endl;
    printArray(arr,size);

    cout<<endl;
    radixSort(arr,size);

    cout<<"after sorting"<<endl;
    printArray(arr,size);
}