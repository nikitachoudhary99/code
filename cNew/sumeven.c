//sum of all even no 
#include<stdio.h>
void main()
{
    int i,n,sum=0;
    printf("enter n\n");
    scanf("%d",&n);
    // for(i=1;i<=n;i++)
    // {  
    //  if(n%2==0)
    //     {
    //         printf("even=%d\n",i);
    //         sum=sum+i;
    //     }
    // }
    // printf("sum of even no = \n",sum);
        
        for(i=2;i<=n;i+=2)
        {
          printf("even no = %d\n",i);
          sum=sum+i;
        }
        printf("sum od even no = %d\n",sum);
}