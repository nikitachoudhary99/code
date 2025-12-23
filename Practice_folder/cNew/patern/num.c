/*
11111
22222
33333
44444
55555

*/
#include<stdio.h>
void main()
{
    int i,j,n;
    printf("enter the value of n\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
}