//wap to calculate sum of digit
#include<stdio.h>
void main()
{
    int n,rem,sum=0;
   
    printf("enter the value of n\n");
    scanf("%d",&n);
    
   int temp=n;
    while(n>0)
    {    
        rem=n%10;
        sum=sum+rem;
        n=n/10;
       
    }
     printf("sum of digit%d=%d\n",temp,sum);
}