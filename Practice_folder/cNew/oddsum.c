//wap to print all odd no and sum of all odd no
#include<stdio.h>
void main()
{
    int i,n;
    int sum=0;
    printf("enter the value of n\n");
    scanf("%d",&n);
    for(i=1;i<=n;i+=2)
    {
        printf("odd no  = %d\n",i);
         sum=sum+i;
    }
    printf("sum=%d\n",sum);
}