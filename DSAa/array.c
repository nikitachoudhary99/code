//array
#include<stdio.h>
void printarr(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        printf("array=%d\n",arr[i]);
    }
}
void main()
{
    int arr[5]={1,2,3,4,5};
    int size=5;
    printarr(arr,size);

}