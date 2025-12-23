/*
  FUNCTION--1>block of code that help us to do specific task 
  2>repetative task
  3>we can call function multiple time
  4>it reduse over code and help us to remove duplicate code
  
  TYPES OF FUNCTION--->
  1>Inbuilt function->function those already defined in c program
    EX- printf(),scanf(),pow()
  2>User define function->function those are created by the user
   SYNTAX:
        returnType functionName (argunment);
        void display();
        {
        1>function declaration->returnType functionName(argunment);
        2>function defination-> returnType functionName(argunment)
             {
                //body of function;
             }
     
        } 

*/
#include<stdio.h>
void display();
void display()
{
 printf("i am from function\n");

}
void main()
{
    printf("i m from main function\n");
    display();
}

/*
  classification of function->
  1> without returnType without argunment
  2>without return type with argument
  3>with return type without argunment
  4>with return type with argument
   
*/