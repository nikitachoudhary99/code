#include<iostream>
using namespace std;
void arrayMax(int arr[],int index,int &max)
{
    if(index<0)
    {
        return ;
    }
    if(arr[index]>max)
    {
        max = arr[index];
    }
    arrayMax(arr,index-1,max);

}
int main()
{
    int arr[5] = {23,15,10,12,85};
    int size = 5;
    int max = 0;

    arrayMax(arr,size-1,max);
    cout<<"next greater value = "<<max<<endl;
}