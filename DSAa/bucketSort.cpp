#include<iostream>
#include<vector>
using namespace std;

void insSort(vector<float> &bucket)
{
    for(int i = 1;i<bucket.size();i++)
    {
        float key = bucket[i];
        int j = i-1;

        while(j>=0 && bucket[j]>key)
        {
            bucket[j+1] =  bucket[j];
            j--;
        }

        bucket[j-1] = key;
    }
}

void bucketSort(float arr[],int size)
{
    vector<float> bucket[size];

    for(int i =0;i<size;i++)
    {
        //placing each value of array [i] into a separate bucket..
        int index = arr[i]*size;
        bucket[index].push_back(arr[i]);
    }

    //to sort each bucket[i] index vector using ins sort
    for(int i =0;i<size;i++)
    {
        insSort(bucket[i]);
    }

    int index=0;
    for(int i = 0;i<size;i++)
    {
        for(int j = 0;j<bucket[i].size();j++)
        {
            arr[index] = bucket[i][j];
            index++;
        }
    }
}

void printArray(float arr[],int size)
{
    for(int i = 0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}
int main()
{
    float arr[] = {0.896,0.543,0.3256,0.9873,0.642};
    int size = 5;

     cout<<"Array before sort"<<endl;
    printArray(arr,size);

    bucketSort(arr,size);

    cout<<"Array after sort"<<endl;
    printArray(arr,size);
    
}