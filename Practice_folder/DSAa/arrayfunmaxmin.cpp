#include<iostream>
using namespace std;
void maxmin(int arr[],int size)
{
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
int main()
{
 int arr[5];
 int size = 5;
 
 for(int i=0;i<size;i++)
 {
    cout<<"Enter the value\n ";
    cin>>arr[i];
 }
 maxmin(arr,size);

}