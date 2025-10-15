/*
--->pointer is a varriable
--->pointer is the special variable that can store address of another varriable 
---->we can also called derefrance oprator(*)
Q.  what is varriable?
ans.Name Memory allocation
int age=25;
syntax:
 datatype  variablename = value;
      int  a =10;

 ----> data type will be always same of varriable address is store=int *ptr=&x;

*/
#include<stdio.h>
void main()
{
    int x=10;
    printf("enter the value of x\n");
    scanf("value of x=%d",&x);

    int *ptr=&x;
    printf("value of ptr=%p\n",ptr); //for print value
    printf("value of ptr=%p\n",&ptr);//for ptr address
    printf("enter the value of x using ptr=%p\n",*ptr);
    *ptr=50;
    printf("value of x=%d\n",x);


}