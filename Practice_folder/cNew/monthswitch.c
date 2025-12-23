#include<stdio.h>
void main()
{
    int n;
    
    printf("enter no between 1 - 12");
    scanf("%d",&n);
   
    switch (n)
    {
        case 1:
        printf("its january\n");
        break;
        case 2:
        printf("its february\n");
        break;
        case 3:
        printf("its march\n");
        break;
        case 4: 
        printf("its april\n");
        break;
        case 5:
        printf("its may\n");
        break;
        case 6:
        printf("its june\n");
        break;
        case 7:
        printf("its july\n");
        break; 
        case 8 :
        printf("its august\n");
        break; 
        case 9:
        printf("its september\n");
        break; 
        case 10:
        printf("its october\n");
        break; 
        case 11:
        printf("its november\n");
        break; 
        case 12:
        printf("its december\n");
        break; 
        default:
        printf("invalid input\n");
        break;
    }
}