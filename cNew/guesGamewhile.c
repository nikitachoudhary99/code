#include<stdio.h>
void main()
{
    int player1;
    int player2;
    printf("welcome to gueseing game\n");
    printf("enter any no between 1 to 10\n");
    scanf("%d",&player1);
    printf("guess any no between 1 to 10\n");
    scanf("%d",&player2);
    while (player1!=player2)
    {  
        if(player2<player1)
        {
         printf("no is low  try again\n");
        }
        else
        {
            printf("no is high try again\n");
        }
            scanf("%d",&player2);    
    }
    printf("no is correct you guesed right");   
}