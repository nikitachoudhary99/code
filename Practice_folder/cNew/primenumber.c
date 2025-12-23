#include<stdio.h>
void main()
{
    int n,i,count=0;
    printf("enter the value of n\n");
    scanf("%d",&n);

    for(int i=2;i<n-1;i++)
    {
        if(n%i==0)
        {
            // printf("%d\n",i);
            count++;
        }
    }
    if(count!=0)
    {
        printf("number is not prime number");
    } 
    else
    {
        printf("number is  prime number");
    }
}