#include<iostream>
using namespace std;
void arraySum(int arr[],int index,int &max)
{
    
    if(index<0)
    {
        return;
    }
    if(arr[index]>max)
    {
        max = arr[index];
    }
  //  sum = sum + arr[index];
    arraySum(arr,index-1,max);
}
int main()
{
    int arr[] = {11,2,3,24,58,6};
    int size = 6;
    int max = 0;
    arraySum(arr,size-1,max);
    cout<<max<<endl;

}