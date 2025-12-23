#include<stdio.h>
void main()
{
    char str[50]="My Name Is Samaira ";
    int count=0;
    int i=0;
    while(str[i]!='\0')
    {
    if(str[i]>='A' && str[i]< 'z')
    {
        count++;
    }
    i++;
    }
    printf("count of uppercase%d",count);

}