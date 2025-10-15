//intersection in array
#include<iostream>
using namespace std;
void intersort(int arr1[],int size1,int arr2[],int size2)
{
    int i=0;
    int j=0;
    while(i<size1 && j<size2)
    if(arr1[i]<arr2[j])
    {
        i++;
    }
    else if(arr2[j]<arr1[i])
    {
        j++;
    }
    else
    {
        cout<<arr1[i]<<" ";
        i++;
        j++;
    }
}

int main()
{
    int arr1[5]={2,5,8,10,60};
    int size1=5;
    int arr2[6]={6,5,8,10,60};
    int size2=6;
    cout<<"inter section in array ";
    intersort(arr1,size1,arr2,size2);
    cout<<endl;
}