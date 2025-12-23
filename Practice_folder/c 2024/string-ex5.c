//string as pointer
#include<stdio.h>
void display(char *ch);
int main()
{
    char c[50];
    printf("enter string");
    gets(c);
    display(c);
    return 0;
}

void display(char *ch)
{
printf("string output ");
puts(ch);
}