//factor of givin no
#include<stdio.h>
void main()
{
    int i,n,factor;
    printf("enter the value of n");
    scanf("%d",&n);
    printf("factor =%d\n",n);
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            printf("%d\n",i);
        }
    }
    printf("\n");
}