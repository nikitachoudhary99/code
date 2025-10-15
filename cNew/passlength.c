//check the pasward length is greter than 6 or less then 8 digit
#include<stdio.h>
void main()
{
    int pasword;
    printf("enter your pasward");
    scanf("%d",&pasword);
    if(pasword=100000 && pasword<99999999)
    {
        printf("your pasword length is between 6 or 8 digit");
    }
    else
    {
       printf(" your paswrd is invalid");
    }
}