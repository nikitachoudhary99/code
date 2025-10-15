//genrate password
#include<stdio.h>
void main()
{
   int correctpassword=12345;
   int pass;
   printf("login page\n");
   printf("enter the passwrd to login\n");
   scanf("%d",&pass);
   while(pass!=correctpassword)
   {
    printf("login page\n");
   printf("enter the passwrd to login\n");
   scanf("%d",&pass);
   }
  printf("you are successfully loged in to page\n");
}