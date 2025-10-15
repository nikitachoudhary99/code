//duplicate element found in array
#include<iostream>
using namespace std;
int main()
{
    int arr[6] = {12,13,12,15,13,17};
    int size = 6;
    for(int i=0;i<6;i++)
    {
      for(int j=i+1;j<6;j++)
     {
        if(arr[i] == arr[j])
        {
            cout<<"duplicate element "<< arr[i]<<" found at indices "<<i<<" and "<<j<<endl;
        }
      }
    }
    return 0;
}