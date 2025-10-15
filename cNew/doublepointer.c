//double pointer--> its special pointer that can store address of pointer 
#include<stdio.h>
void main()
{
 int x=10;
 int *ptr=&x;
 //double pointer
 int **pt=&ptr;
 printf("enter the value of pt=%p\n",pt);
 printf("address of pt=%p\n ",&pt);
 printf("value of x using pt=%d\n ",**pt);
 **pt=50;
 printf("value of x=%d\n",x);
}