//calculate discount for difrent gender
#include<stdio.h>
void main()
{
    int price;
    char gen;
    float dis;

    printf("enter price \n");
    scanf("bill=%d",&price);

    printf("enter gender\n");
    scanf(" %c",&gen);
   // scanf("  %c", &gen);

    if(gen=  'f' || gen== 'F')
    {
        if(price>1000)
        { 
            dis=price*0.15;
            printf("discount is =%g",dis);
        }
        else
        {
            dis=price*0.10;
             printf("discount is =%g",dis);  
        }
    }
    else
    {
     if(price>1000)
     {
         dis=price*0.8;
             printf("discount is =%g",dis); 
     }
     else
     {
         dis=price*0.05;
             printf("discount is =%g",dis); 
     } 

    }
}