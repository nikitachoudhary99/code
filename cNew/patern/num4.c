/*
 1
 21
 123
 4321
 12345
*/
#include<stdio.h>
void main()
{
  int i,j,n;

  printf("enter the value of n \n ");
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",j);
        }
    }
    else
    {
        for(j=i;j>=1;j--)
        {
            printf("%d",j);
        }
    }
    printf("\n");
  } 
}