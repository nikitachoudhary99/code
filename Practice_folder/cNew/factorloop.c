// wap to print all the factor of given no
#include<stdio.h>
void main()
{
    int i,n;
    printf("enter the value of n\n");
    scanf("n=%d",&n);

    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            printf("factor = %d\n",i);
        }
    }
}