//radix sort
#include<iostream>
using namespace std;
int getmax(int arr[],int size)
{
   int max=arr[0];
   for(int i=0;i<size;i++)
   {
      if(arr[i]>max)
      {
        max=arr[i];
      }
   }
   return max;
}

    void countsort(int arr[], int size, int ex)
    {
       int count[10] = {0}; // Array to store the count of digits
       int output[size];     // Output array to store the sorted elements
    
       // Store count of occurrences
       for (int i = 0; i < size; i++)
       {
          int index = (arr[i] / ex) % 10;
          count[index]++;
       }
    
       // Calculate cumulative count
       for (int i = 1; i < 10; i++)
       {
          count[i] += count[i - 1];
       }
    
       // Place the elements in their correct positions in the output array
       for (int i = size - 1; i >= 0; i--)
       {
          int index = (arr[i] / ex) % 10;
          output[count[index] - 1] = arr[i];
          count[index]--;
       }
    
       // Copy the output array to arr[], so that arr[] contains sorted numbers
       for (int i = 0; i < size; i++)
       {
          arr[i] = output[i];
       }
    }
    

void radixsort(int arr[],int size)
{
   int max1=getmax(arr,size);
   for(int ex=1;max1/ex>0;ex=ex*10)
   {
    countsort(arr,size,ex);
   }
}
void printarr(int arr[],int size)
{
   for(int i=0;i<size;i++)
   {
    cout<<arr[i]<<"\t";
   }
   cout<<endl;
}
int main()
{
    int arr[]={20,46,2,13,45,85};
    int size=6;
    cout<<"array before sort"<<endl;
    printarr(arr,size);

    cout<<endl;
    radixsort(arr,size);
    cout<<"after sorting"<<endl;
    printarr(arr,size);
}