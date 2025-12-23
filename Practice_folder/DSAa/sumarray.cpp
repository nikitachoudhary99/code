//sum of array
#include<iostream>
using namespace std;
void arraysum(int arr[],int index,int &sum)
{
    if(index<0)
    {
        return;
    }
    sum=sum+arr[index];
     arraysum(arr,index-1,sum);
}
int main()
{
    int arr[5]={50,60,12,30,10};
    int size=5;
    int sum=0;
    arraysum(arr,size-1,sum);
    cout<<sum<<endl;

}