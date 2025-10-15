//union of two sorted array 
#include<iostream>
using namespace std;
void unionsortedarr(int arr1[],int size1,int arr2[],int size2)
{
    int i=0;
    int j=0;
    //i samaler
    while(i<size1 && j<size2)
    {
        if(arr1[i]<arr2[j])
        {
            if(i==0 || arr1[i]!=arr1[i-1] )
            {
                cout<<arr1[i]<<" ";
            }
            i++;
        }
        //j is smallr
        else if(arr2[j]<arr1[i])
        {
            if(j==0|| arr2[j]!=arr2[j-1])
            {
                cout<<arr2[j]<<" ";
            }
            j++;
        }
        //both same
        else
        {
            if(i==0||arr1[i]!=arr1[i-1])
            {
                cout<<arr1[i]<<" ";
            }
            i++;
            j++;
        }
    }
    //bache huye element
    while(i<size1)
    {
        if(i==0||arr1[i]!=arr1[i-1] )
            {
                cout<<arr1[i]<<" ";
            }
            i++;
    }
    while(j<size2)
    {
        if(j==0|| arr2[j]!=arr2[j-1])
        {
            cout<<arr2[j]<<" ";
        }
        j++;
    }


}
int main()
{
    int arr1[6]={1,2,3,4,5,6};
     int size1=6;
    int arr2[3]={7,8,9};
    int size2=3;
     cout<<"union of sorted array = \t";
    unionsortedarr(arr1,size1,arr2,size2);
    cout<<endl;

}