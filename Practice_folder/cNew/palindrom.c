//palindrom-->> palindrom no aage piche ek jese no jese 1221  123321
#include<stdio.h>
void main()
{
    int n,rem,rev=0;
    printf("enter the value of n\n");
    scanf("%d",&n);
    int temp=n;
     while(n>0)
     {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
     }
     if(temp==rev)
     {
        printf("given number is palindrom\n");
     }
     else
     {
        printf("given number is not palindrom");
     }
}