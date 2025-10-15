//wap to count factor of given no
#include<stdio.h>
void main()
{
    int i,n,count=0;
    printf("enter the value of n\n");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            printf("factor=%d\n",i);
            count++;
        }
    }
    printf("count of factor of %d=%d\n",n,count);
}