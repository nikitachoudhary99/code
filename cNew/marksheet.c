//print marksheet for 5 subject
#include<stdio.h>
void main()
{
    float m1,m2,m3,m4,m5,avrg;
    printf("enter m1 subject mark");
    scanf("%g",&m1);
     printf("enter m2 subject mark");
    scanf("%g",&m2);
     printf("enter m3 subject mark");
    scanf("%g",&m3);
     printf("enter m4 subject mark");
    scanf("%g",&m4);
     printf("enter m5 subject mark");
    scanf("%g",&m5);

    avrg=(m1+m2+m3+m4+m5)/5;
    printf("avrg=%g",avrg);
    

}

