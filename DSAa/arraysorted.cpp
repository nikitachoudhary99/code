//WAP to check whether array sorted or not
#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {5,6,8,9,10};
    int size = 5;
    for(int i=1;i<size;i++)
    {
        if(arr[i]>arr[i-1])
        {
            cout<<"array is sorted"<<endl;
            return true;
        }
    }
    return false;
    cout<<"array is unsorted"<<endl;
}