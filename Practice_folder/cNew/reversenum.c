//wap to print reverse no
#include<stdio.h>
void main()
{
    int n,rev=0,rem;
    printf("enter the value of n\n");
    scanf("%d",&n);
    int temp=n;
    while(n>0)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
    printf(" number %d\n reverse number%d\n",temp,rev);
}