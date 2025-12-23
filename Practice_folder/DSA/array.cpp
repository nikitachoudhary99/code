#include<iostream>
using namespace std;
bool linearsearch(int arr[],int size,int k)
{
    for(int i=0;i<size;i++)
    {
        if(arr[i]==k)
        {
            return true;
        }
    }
    return false;
}