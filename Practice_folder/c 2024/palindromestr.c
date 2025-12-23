// input a string and cheak if it palindrome or not
#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
    int i, n,rev;
 printf("enter the string");
 scanf("%s ",str);
 n=strlen(str);
 for(i=0;i<n/2;i++)
 {
    if (str[i]==str[n-i-1])
    rev++;
 }
 if(rev==i)
 {
    printf("your string is palindrome");
 }
else 
{
    printf("your string is not palindrome");
}

} 