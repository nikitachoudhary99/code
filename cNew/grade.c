/*wap to take input of 5 sub marks and calculate the percent according to per rint the grade
   90>=A+
   >90but<70=A
   >70but<=50=B
   >50but<=40=C
   >40=fail

*/
#include<stdio.h>
void main()
{
    float phy,che,math,hindi,eng,sum,per;
    printf("enter the physics marks\n");
    scanf("%f", &phy);
    printf("enter the chemistry marks\n");
    scanf("%f" ,&che);
    printf("enter the math marks\n");
    scanf("%f", &math);
    printf("enter the hindi marks\n");
    scanf("%f" ,&hindi);
    printf("enter the english marks\n");
    scanf("%f" , &eng);
    sum=phy+che+math+hindi+eng;
    printf("sum of all sub =%.2f\n",sum);
    per=(sum/500)*100;
    printf("percent=%.2f\n",per);
    if(per>=90)
    {
        printf("grade A+\n");
    }
    else if(per>70 && per < 90)
    {
        printf("grade A\n");
    }
    else if(per>50 && per <= 70)
    {
        printf("grade B\n");
    }
    else if(per<40 && per<=50)
    {
       printf("grade C\n");
    }
    else if(per<=40)
    {
        printf("fail\n");
    }


}
