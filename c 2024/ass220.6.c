//a function to copy the string without using library
#include<stdio.h>
void strcpy(char*ptr1,char *ptr2);

{
    while(*ptr2 !='\0')
    {
        *ptr1=*ptr2;
        ptr1++;
        ptr2++;
    }
    *ptr='\0';
}
int main()
{
    char str1[15],str2[15];
   
    printf("enter str1 \n");
    scanf("%s",str1); 
     printf("enter str2 \n");
    scanf("%s",str2);

    strcpy(str1,str2);
    printf("enter str1 \n");
    scanf("%s",str1); 
     printf("enter str2 \n");
    scanf("%s",str2); 
    return 0;
}