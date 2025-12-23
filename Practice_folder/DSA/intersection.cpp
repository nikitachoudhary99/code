#include<iostream>
using namespace std;
void interSort(int arr1[],int size1,int arr2[],int size2)
{
    int i = 0;
    int j = 0;

    while(i<size1 && j<size2)
    {
        if(arr1[i]<arr2[j])
        {
            i++;
        }
        else if(arr1[i]>arr2[j])
        {
            j++;
        }
        else
        {
            cout<<arr1[i]<<"\t";
            i++;
            j++;
        }
    }
}
int main()
{
    int arr1[8] = {2,4,6,8,10,12,14,16};
    int size1 = 8;

    int arr2[5] = {2,4,12,20,24};
    int size2 = 5;

    cout<<"intersection of two sorted array = ";
    interSort(arr1,size1,arr2,size2);

    cout<<endl;
 }