//calculate si
#include<stdio.h>
void main()
{
    float p,r,t,si;

    printf("enter the value of p\n,r\n,t\n");
    scanf("%g%g%g",&p,&r,&t);

    si=(p*r*t)/100;
    printf("si=%g",si);
}