//pattern peramid star shap
#include<iostream>
using namespace std;
int main()
{
    int i,j,n;
    cout<<"enter the value of n"<<endl;
    cin>>n;
    for(i=1;i<=n;i++)
    {
        //space
        for(j=1;j<=n-i;j++)
        {
            printf(" ");
        }
        for(j=1;j<=2*i-1;j++)
        {
            printf("*");
        }
       printf("\n");
    }
     

}