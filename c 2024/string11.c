#include<stdio.h>
void main()
{//not space counting
    char str[50]="my name is samaira";
    int i=0;
    int count=0;
    while(str[i]!='\0')
{
if(str[i]>='A' && str[i]<'Zg')
{
    count++;
}
i++;
}
printf("countof lowercase%d",count);
}