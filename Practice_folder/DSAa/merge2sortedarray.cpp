//merge two sorted array into third array
#include<iostream>
using namespace std;
void merge(int arr1[],int size1,int arr2[],int size2,int arr3[])
{
    int i = 0; //work for array 1 till size1
    int j = 0; //work for arr2 till size2
    int k = 0; //work on arr3 for filling element
  while(i<size1 && j<size2)
    {
      if(arr1[i]<= arr2[j])
      {
        arr3[k] = arr1[i];
        i++;
        k++;    
      }
      else if(arr2[j] < arr1[i])
      {
        arr3[k] = arr2[j];
        j++;
        k++;
      }
    }
    //if any array goes empty
    if(i>=size1)
    {
      while(j<size2)
      {
        arr3[k] = arr2[j];
        j++;
        k++;    
      }
    }
    if(j>=size2)
    {
        while(i<size1)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        } 
    }
        
} 
int main()
{
    int arr1[5] = {6,7,9,11,14};
    int size1 = 5;

    int arr2[6] = {5,8,12,13,15,17};
    int size2 = 6;

    int arr3[11];

    merge(arr1,size1,arr2,size2,arr3);

    for(int i=0;i<11;i++)
    {
        cout<<arr3[i]<<"\t";
    }
}
