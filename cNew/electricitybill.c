//electricity bill
#include<stdio.h>
void main()
{
   int lUnit,cUnit,netUnit;
   float netAmt;
   printf("enter the last month unit");
   scanf("%d",&lUnit);
   printf("enter the current month unit");
   scanf("%d",&cUnit);
   netUnit=cUnit-lUnit;
   if(netUnit>=0 && netUnit<=100)
   {
    netAmt=netUnit*2;
   }
   else if(netUnit>100 && netUnit<=200)
   {
    netAmt=netUnit*3;
   }
   else if(netUnit>200 && netUnit<=300)
   {
    netAmt=netUnit*4;
   }
   else
   {
    netAmt=netAmt*5;
   }
   printf("net amount=%.2f",netAmt);


}