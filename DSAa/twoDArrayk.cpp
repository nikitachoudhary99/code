//two d array by kisan sir
#include<iostream>
#define row 3
#define col 3
using namespace std;
void arrsum(int arr[][col],int i,int j,int &sum)
{
   if(i==row)
   {
    return;
   }
   if(j==col)
   {
    arrsum(arr,i+1,0,sum);
    return;
   }
   sum=sum+arr[i][j];
   arrsum(arr,i,j+1,sum);
   return;
}
int main()
{
    int arr[row][col]={ {1,2,3},{2,3,4},{6,5,8}};
    int sum=0;
    arrsum(arr,0,0,sum);
    cout<<sum<<endl;
}