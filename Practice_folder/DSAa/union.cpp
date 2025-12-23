#include<iostream>
using namespace std;
void unionSort(int arr1[],int size1,int arr2[],int size2)
{
    int i = 0;
    int j = 0;
    
    while(i<size1 && j<size2)
    {
        if(arr1[i]<arr2[j]) // i smaller
        {
            if(i==0 || arr1[i] != arr1[i-1])
            {
                cout<<arr1[i]<<"\t";
            }
            i++;
        }
        else if(arr2[j]<arr1[i]) // j smaller
        {
            if(j==0 || arr2[j]!= arr2[j-1])
            {
                cout<<arr2[j]<<"\t";
            }
            j++;
        }
        else // both same
        {
            if(i==0 || arr1[i]!= arr1[i-1])
            {
                cout<<arr1[i]<<"\t";
            }
            i++;
            j++;
        }
    }

    while(i<size1)
    {
        if(i==0 || arr1[i]!=arr1[i-1])
        {
            cout<<arr1[i]<<"\t";
        }
        i++;
    }
    while(j<size2)
    {
        if(j==0 || arr2[j]!=arr2[j-1])
        {
            cout<<arr2[j]<<"\t";
        }
        j++;
    }
}
int main()
{
    int arr1[5] = {2,4,6,8,10};
    int size1 = 5;

    int arr2[4] = {12,14,16,18};
    int size2 = 4;

    cout<<"union of sorted array = ";
    unionSort(arr1,size1,arr2,size2);
    cout<<endl;

}