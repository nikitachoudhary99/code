#include<iostream>
using namespace std;
void unionsort(int arr1[],int size1,int arr2[],int size2)
{
    int i=0;
    int j=0;
    while(i<size1 && j<size2)
    {
        if(arr1[i]<arr2[j])
        {
            if(i==0 || arr1[i]!=arr1[i-1])
            {
                cout<<arr1[i]<<" ";
            }
          i++;
        }
        else if(arr2[j]<arr1[i])
        {
            if(j==0|| arr2[j]!=arr2[j-1])
            {
                cout<<arr2[j]<<" ";
            }
            j++;
        }
        else
        {
            if(i==0|| arr1[i]!=arr1[i-1])
            {
                cout<<arr1[i]<<" ";
                
            }
            i++;
            j++;
        }
    }
    while(i<size1)
    {
        if(i==0|| arr1[i]!=arr1[i-1])
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
    int arr1[5]={58,69,89,99,101};
    int size1=5;
    int arr2[5]={8,9,89,99,101};
    int size2=5;
    cout<<"union of sorted arry";
    unionsort(arr1,size1,arr2,size2);
    cout<<endl;
}