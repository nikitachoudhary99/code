//area of circle
#include <stdio.h>
#define PI 3.14159  // Define the value of PI

void main() {
    float radius, area;

    // Input: Radius of the circle
    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    // Calculating the area
    area = PI * radius * radius;

    // Output: Area of the circle
    printf("The area of the circle is: %.2f\n", area);
}