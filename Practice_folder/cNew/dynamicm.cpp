//dynamic memory allocation//malloc
//#include<iostream>
//using namespace std;
#include<stdio.h>
#include<stdlin.h>
int main()
{
    int ptr*;
(int*)malloc(6*sizeof(int));
if(ptr==NULL)
{
    printf("space not allocated\n");
}
else
{
    printf("space  allocated\n");
}
}