//wap to print age ,mob, per
#include<stdio.h>
void main()
{
    int age;
    long int mob;
    float per;

    printf("enter your age\n");
    scanf("%d",&age);

    printf("enter your mob");
    scanf("%ld",&mob);

    printf("enter your per");
    scanf("%g",&per);

    printf("user age=%d\n",age);
    printf("user mob=%ld\n",mob);
    printf("user per=%g",per);
}