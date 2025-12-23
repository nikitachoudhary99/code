//wap to to cheak leap year
#include<stdio.h>
void main()
{
    int year;
    printf("enter the year you want to check for leap year");
    scanf("%d",&year);

    year/4==0?printf("its leap year"):printf("its not leap year");
}