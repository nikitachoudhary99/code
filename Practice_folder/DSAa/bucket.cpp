#include<iostream>
#include<vector>
using namespace std;
void insSort(vector<float> &nums)
{
    for(int i=1;i<nums.size();i++)
    {
        float key = nums[i];
        int j = i-1;

        while(j>=0 && nums[j]>key)
        {
            nums[j+1] = nums[j];
        }
        nums[j+1] = key;
    }
}
void printArray(float arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}
void bucketSort(float arr[],int size)
{
    vector<float> bucket[size];

    //seprating into separate bucket
    for(int i=0;i<size;i++)
    {
        int index = arr[i]*size;

        bucket[index].push_back(arr[i]);
    }

    //sorting each bucket using insertion sort
    for(int i=0;i<size;i++)
    {
        insSort(bucket[i]);
    }

    //copying it to main array
    int index = 0;
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<bucket[i].size();j++)
        {
            arr[index] = bucket[i][j];
            index++;
        }
    }
}
int main()
{
    float arr[] = {0.384,0.865,0.217,0.563,0.783,0.486};
    int size = 6;

    cout<<"before sorting"<<endl;
    printArray(arr,size);

    cout<<endl;
    bucketSort(arr,size);

    cout<<"after sorting"<<endl;
    printArray(arr,size);
    
}