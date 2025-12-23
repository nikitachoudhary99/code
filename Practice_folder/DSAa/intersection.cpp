//intersection of two shorted array
#include<iostream>
using namespace std;
void intersectionarr(int arr1[],int size1,int arr2[],int size2)
{
    int i=0;
    int j=0;
    while(i<size1 && j<size2)
    {
        if(arr1[i]>arr2[j])
        {
            i++;
        }
        else if(arr1[i]<arr2[j])
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
}
int main()
{
    int arr1[8]={1,2,3,4,5,6,7,8};
    int size1=8;
    int arr2[8]={1,2,3,4,5,10,11,12};
    int size2=8;
    cout<<"intersectionarr of two shorted array";
    intersectionarr(arr1,size1,arr2,size2);
    cout<<endl;
}