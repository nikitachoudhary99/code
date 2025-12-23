//area of rectangle
#include<stdio.h>
void main()
{
    float len,wid,area;
     printf("Enter the length of the rectangle: ");
    scanf("%f", &len);

    
    printf("Enter the width of the rectangle: ");
    scanf("%f", &wid);
    area=len*wid;
     printf("The area of the rectangle is: %g\n", area);
}