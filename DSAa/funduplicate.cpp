#include<iostream>
using namespace std;
int duplicate(int arr[],int size)
{
    for(int i=0;i<8;i++)
    {
        for(int j=i+1;j<8;j++)
        {
            if(arr[i]==arr[j])
            {
                cout<<"duplicate value found at index: "<<arr[i]<<" "<<arr[j]<<endl;
            }
        }
    }
    return 0;
}
int main()
{
    int arr[8] = {1,2,3,2,4,5,3,6};
    int size = 8;
    
   int ans = duplicate(arr,size);
}