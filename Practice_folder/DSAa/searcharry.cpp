//search the element minor max
#include<iostream>
using namespace std;

int display(int arr[],int size)
{  int max=0,min=0;
    for(int i=0;i<size;i++)
    {
    if(arr[i]>arr[max])
    {
        max=i;
    }
    else if(arr[i]<arr[min])
      {
        min=i;
      }
    }
    cout<<"maximum value of array="<<arr[max]<<endl;
    cout<<"minimum value of array="<<arr[min]<<endl;
}
int main()
{
  int arr[5];
  int size=5;
  for(int i=0;i<5;i++)
  {
    cout<<"enter the value of  index "<<  i  <<endl;
    cin>>arr[i];
  }
  for(int i=0;i<5;i++)
  {
    cout<<"value of "<< i<< " index  " << arr[i]<<endl;

  }


}