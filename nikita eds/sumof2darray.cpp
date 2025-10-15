//find sum of 2D array in recursion
#include<iostream>
#define row 2
#define col 3
using namespace std;
void arraySum(int arr[][col],int i,int j,int &sum)
{
    if(i==row)
    {
        return;
    }
    if(j==col)
    {
        arraySum(arr,i+1,0,sum);
        return;
    }
    sum = sum + arr[i][j];

    arraySum(arr,i,j+1,sum);
}
int main()
{
 int arr[row][col] = {{7,8,3},{3,4,6}};
 int sum = 0;

 arraySum(arr,0,0,sum);
 cout<<sum<<endl;
}