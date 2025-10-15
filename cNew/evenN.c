//wap to print all the even no, till n ferm
#include<stdio.h>
void main()
{
    int i,n;
    printf("enter the value of n\n");
    scanf("%d",&n);
    // for(i=1;i<=n;i++)
    // {
    //     if(i%2==0)
    //     {
    //      printf("even=%d\n",i);   
    //     }
    // }
    for(i=2;i<=n;i+=2)
    {
        printf("even no=%d\n",i);
    }
}