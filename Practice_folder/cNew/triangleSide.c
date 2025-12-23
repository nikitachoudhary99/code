//wap to take input of angle of triangle and check whether a triangle is equal ,equilateral,isosceles
#include <stdio.h>

void main() {
    float angle1, angle2, angle3;

    printf("Enter the first angle of the triangle: ");
    scanf("%f", &angle1);

    printf("Enter the second angle of the triangle: ");
    scanf("%f", &angle2);

    printf("Enter the third angle of the triangle: ");
    scanf("%f", &angle3);

    
    if (angle1 + angle2 + angle3 != 180) {
        printf("The angles do not form a valid triangle.\n");
    }
     else if (angle1 == angle2 && angle2 == angle3)
      {
            printf("The triangle is an Equilateral triangle.\n");
        }

        else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            printf("The triangle is an Isosceles triangle.\n");
        }
    
        else {
            printf("The triangle is a Scalene triangle.\n");
        }
    }

