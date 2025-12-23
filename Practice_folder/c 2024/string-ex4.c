//string as an array
#include<stdio.h>
void display(char ch[]);
int main ()
{
    char c[50];
    gets(c);
    display(c);
    return 0;
}
void display(char ch[])
{
    printf("string otput");
    puts(ch);
}