#include<stdio.h>
void main()
{
    char str[50]="calculating number";
    int i=0;
    while(str[i]!='\0')
    {
        i++;
    }
    printf("length of string=%d",i);
    
}