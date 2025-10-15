//input shopping price and gender if user is female calculate the discount of 10%
#include<stdio.h>
void main()
{
    int shoppingprice;
    char gender;
    float discount;
    printf("enter the shopping price price");
    scanf("shoppingprice=%d",&shoppingprice);

    printf("enter gender");
    scanf("gender =  %c", &gender);

    discount=0;
    if(gender=='f' && gender=='F')
    printf("client is female discount is 10% ");
    
    else
    printf("no discount availabe");
} 