//factorial in c
#include<stdio.h>
void main()
{
    long long int i,n,fact=1;
    printf("enter the value of n\n");
    scanf("%lld",&n);

    for(i=1;i<=n;i++)
     {
        fact=fact*i;
     }
    printf("fact=%lld\n",fact);
}