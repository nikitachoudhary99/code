//wap to prime
#include<stdio.h>
void main()
{
    int i,n,j,isprime=1;
    printf("enter the value of n\n");
    scanf("%d",&n);
    printf("prime no =%d\n",n);
    for(i=1;i<=n;i++)
    {
       for(j=2;j<i;j++)
       {
        if(i%j==0)
        {
            isprime==0;
            break;
        }
       }
       if(isprime==1)
       {
        printf("%d",i);
       }
       printf("\n");
    }



}