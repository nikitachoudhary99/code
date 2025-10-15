//wap to print odd 
#include<stdio.h>
void main()
{
    int n,i;
    printf("enter the value of n\n");
    scanf("%d",&n);
    // for(i=1;i<=n;i+=2)
    // {
    //     printf("odd=%d\n",i);
    // }
    for(i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            printf("odd=%d\n",i);
        }
    }
}