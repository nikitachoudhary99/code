//wap to print armstrong no
#include<stdio.h>
void main()
{
    int n,rem,temp,sum=0;
    printf("enter the value of n\n");
    scanf("%d",&n);
    temp=n;
    while(n>0)
    { 
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
    }
    if(sum==temp)
    {
        printf("given no is armstrong\n");
    }
    else
    {
         printf("given no is not armstrong\n");
    }
} 