//wap to count no of digit of given no 348641
#include<stdio.h>
void main()
{
    int n=348641;
    int count=0;
    
 
    while (n>0)
    {
        //printf("number= %d",n);
        count++;
           n=n/10;
    }
     printf("number of digit count= %d",count);
    
}