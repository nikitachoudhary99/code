#include<iostream>
using namespace std;
int main()
{
    int arr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    int i,j;
    
    int sum = 0;

    for(i=0;i<3;i++)
    {
        
        for(j=0;j<3;j++)
        {
            sum = sum+arr[i][j];
        }
        cout<<endl;
        cout<<"sum of row and column = "<<arr[i][j]<<sum;
    }
}