//wap to print fibonacci series
#include<stdio.h>
void main()
{
    int i ,n,next,first=0,sec=1;
    printf("enter the value of n\n");
    scanf("%d",&n);
    
   
   
    if(n>=1)
    {
         printf("fibbonacci series\n");
        printf("%d",first);
    }
    if(n<=2) 
    {
         
        printf("%d",sec);
    }   
   
    for(i=3;i<=n;i++)
    {
        next=first+sec;
        
       
        
        
        first=sec;
        sec=next;
        next=first;
         printf("next=%d\n",next);
    }
    printf(" \n");
}