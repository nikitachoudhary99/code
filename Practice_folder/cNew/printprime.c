//prime no 
#include<stdio.h>
void main()
{
    int n,i,count=0;
    printf("enter the value of n\n");
    scanf("%d",&n);
/* type 1
    // for(int i=1;i<=n;i++)
    // {
    //     if(n%i==0)
    //     {
    //         printf("%d\n",i);
    //     }
    // }
    // if(count==0)
    // {
    //     printf("number is prime number");
    // } 
    // else
    // {
    //     printf("number is not prime number");
    // }
    */
    /* type 2
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            printf("%d\n",i);
        }
    }
    if(count==0)
    {
        printf("given no is prime no\n");
    }
    else
    {
        printf("no is not prime no");
    }
    */
 
 
 // type 3
   for(i=2;i<=(n/2);i++)
    {
        if(n%i==0)
        {
            printf("%d\n",i);
        }
    }
    if(n%i==0)
    {
        printf("given no is prime no\n");
    }
    else
    {
        printf("no is not prime no");
    }


}