//merge two sort array into third array in sort form
#include<iostream>
using namespace std;
void merge(int arr1[],int size1,int arr2[],int size2, int arr3[])
{
    int i=0;
    int j=0;
    int k=0;
    while(i<size1 && j<size2)
    {
        if(arr1[i]<=arr2[j])
        {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        else if(arr2[j]<arr1[i])
        {
            arr3[k]=arr2[j];
            j++;
            k++;
        }
    }
    if(i>=size1)
    {
        while(j<size2)
        {
            arr3[k]=arr2[j];
            j++;
            k++;
        }
    }
    if(j>=size2)
    {
        while(i<size1)
        {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
    }
}
int main()
{
    int arr1[8]={2,5,6,7,8,9,10,11};
    int size1=8;
    int arr2[3]={8,9,10};
    int size2=3;
    int arr3[11];
    merge(arr1,size1,arr2,size2,arr3);
    for(int i=0;i<11;i++)
    {
        cout<<arr3[i]<<"\t";
    }


}