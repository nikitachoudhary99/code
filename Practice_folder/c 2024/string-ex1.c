//c program to read line of text manually..
#include<stdio.h>
int main()
{
    char name[50],ch;
    int i=0;
    printf("enter name");
    while(ch!='\n')
    {
        ch=getchar();
        name[i]=ch;
        i++;
    }
    name[i]='\0';
    printf("name=%s",name);
    return 0;
}