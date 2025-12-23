//find sum of 1D array using recursion
#include<iostream>
using namespace std;
void arraySum(int arr[],int index,int &sum)
{
  if(index<0)
  {
   return ;
  }
  
  sum = sum + arr[index];
  arraySum(arr,index-1,sum);
}
int main()
{
    int arr[5] = {1,2,3,4,5};
    int size = 5;
    int sum = 0;

     arraySum(arr,size-1,sum);
     cout<<"sum = "<<sum<<endl;
}