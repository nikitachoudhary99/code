//WAP to check  in  array  maximum and minimum 
#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {5,6,3,11,15};
    int size = 5;
    int max = 0;
    int min = 0;
    for(int i=1;i<size;i++)
    {
        if(arr[i]>arr[max])
        {
            max = i;
        }
        else if(arr[i]<arr[min])
        {
            min = i;
        }
    
    }
    cout<<"maximum value in array "<<arr[max]<<endl;
    cout<<"minimum value in array "<<arr[min]<<endl;

}