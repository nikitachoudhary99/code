//linear search without using function
#include<iostream>
using namespace std;
int main()
{
    int arr[5]={1,2,3,4,5};
    int size=5;
    int i, k;
    cout<<"enter the element you want to found"<<endl;
    cin>>k;
    for(i=0;i<size;i++)
    {
        if(arr[i]==k)
        {
            cout<<"Element found"<<endl;
            return 1;
            
        }
        
    }
    cout<<"element not found"<<endl;
  return 0;
}