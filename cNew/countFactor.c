//wap to print count of factor of given no
#include<stdio.h>
void main()
{
    int i,n,count=0;
    printf("enter the value of n\n");
    scanf("%d",&n);
    printf("factor =%d\n",n);
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        { 
            printf("%d\n",i);
           // count++;//total count no
           count=count+i;//sum of count
        }
    }
    
            printf("count of factor =%d",count);
   

}
