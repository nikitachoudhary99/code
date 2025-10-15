//wap to take input cost price and selling price whether user made profit and loss
#include<stdio.h>
void main()
{
    float sprice,cprice;
    printf("enter the value of cost price");
    scanf("%g",&cprice);
    printf("enter the value of selling price");
    scanf("%g",&sprice);

    sprice > cprice ? printf("profit") : printf("loss");
    



}