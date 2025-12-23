//check vovel or consonant
#include<stdio.h>
void main()
{
    char ch;
    printf("enter any character");
    scanf("%c",&ch);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='i'||ch=='O'||ch=='u')
      {
        printf("character is vovel");
      }
      else
      {
        printf("character is consonant");
      }
}