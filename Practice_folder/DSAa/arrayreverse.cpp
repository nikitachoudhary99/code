//WAP to reverse array
#include<iostream>
using namespace std;
int main()
{
    int arr[6] = {2,4,6,8,10,12};
    int size = 6;
    int i =0;
    int j = size-1;
    cout<<"original array"<<endl;
    for(int i=0;i<size;i++)
    {
        
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    while(i<j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    cout<<"reverse array"<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}