//copy of intersection
#include<iostream>
using namespace std;
void intersort(int arr1[],int size1,int arr2[],int size2)
{
    int i=0;
    int j=0;
    //
    while(i<size1 && j<size2)
 {    if(arr1[i]<arr2[j])
        {
            i++;
        }
        else if(arr1[i]>arr2[j])
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
    int arr1[5]={5,9,10,13,15};
    int size1=5;
    int arr2[3]={12,13,15};
    int size2=3;
    cout<<"intersection of two sorted array";
    intersort(arr1,size1,arr2,size2);
    cout<<endl;
}