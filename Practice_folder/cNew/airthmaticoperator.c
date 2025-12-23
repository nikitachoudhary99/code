//binary operator-->>1>airthmetic operator(+,-,*,/,%)
#include<stdio.h>
void main()
{ 
    int a=10;
    int b=20;//compile time
    int sum=a+b;
    int sub=a-b;
    int mul=a*b;
    int div=a/b;
    int mod=a%b;
printf("sum of %d & %d =%d\n",a,b,sum);
printf("sub of %d & %d = %d\n",a,b,sub);
printf("mul of %d & %d =%d\n",a,b,mul);
printf("div of %d & %d = %d\n",a,b,div);
printf("mod of %d & %d =%d",a,b,mod);
}