// fibbonacci series ........
#include<stdio.h>
void main()
{
    int i,n;
    printf("enter the value of n\n");
    scanf("%d",&n);
     int p1=-1;
     int p2=1;
     int term;
    for(i=1;i<=n;i++)
    {
       term=p1+p2;
       printf("term=%d\n",term);
       p1=p2;
       p2=term;
       
    }
}