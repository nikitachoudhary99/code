//2D array
#include<iostream>
using namespace std;
int main()
{
    //declare a 2Darray......
    //data type arrayName[row size][col size];
    //compile time initialize
    int arr[3][4]={{3,4,5,6},{2,3,4,6},{5,4,3,2}};
    //int arr[3][4]
    int i,j;
    //runtime value col wise entry...
    //for(i=0;i<3;i++)
      //{
         //for(j=0;j<4;j++)
         //{
         //
         //}
     //}
    //access element from 2 D array....
    int sum=0;
    for(i=0;i<3;i++)
    {
       sum=0;
       for(j=0;i<4;j++)
       {
        sum=sum+arr[i][j];
       }
       cout<<"sum"<<sum;
    } 
}