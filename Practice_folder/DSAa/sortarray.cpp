//shorting array 
#include<iostream>
using namespace std;

bool issort(int arr[],int size)
{
    for(int i=1;i<size-1;i++)
    {
        if(arr[i]<arr[i-1])
        {
            return false;
        }
    }
   return true; 
}
 
int main()
{
    int arr[5]={50,50,60,120,130};
    int size=5;
    bool ans=issort(arr,size);
    if(ans==true)
    {
        cout<<"array is sorted in ascending order"<<endl;
    }
    else
    {
        cout<<"array is unsorted"<<endl;
    }

    

}