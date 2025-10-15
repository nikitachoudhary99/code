#include <stdio.h>

int main() {
    int n = 7; 

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= n; j++) {
        
            if (j == 0 || j == n || i == 0 || i == n/2) {
                if (i != 0 || (j != 0 && j != n)) 
                    printf("*");
                else
                    printf(" ");
            }
            else {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}
