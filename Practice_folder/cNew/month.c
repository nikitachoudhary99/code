//wap to take input of 1 to 12 and print the month
#include<stdio.h>
void main()
{
    int n;
    printf("enter the no of (1 to 12)\n");
    scanf("%d",&n);

    if(n==1)
    {
        printf("January\n");
    }
    else if(n==2)
    {
        printf("February\n");
    }
    else if(n==3)
    {
        printf("march\n");
    }
    else if(n==4)
    {
        printf("april\n");
    }
    else if(n==5)
    {
        printf("may\n");
    }
    else if(n==6)
    {
        printf("june\n");
    }
    else if(n==7)
    {
        printf("july\n");
    }
    else if(n==8)
    {
        printf("august\n");
    }
    else if(n==9)
    {
        printf("september\n");
    }
    else if(n==10)
    {
        printf("october\n");
    }
    else if(n==11)
    {
        printf("november\n");
    }
    else if(n==12)
       {
            printf("december\n");
        }
        else
        {
            printf("invalid ");
        }
    }
