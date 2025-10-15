//name print
#include <stdio.h>

int main() {
    // Define an array to store the user's input
    char name[100];  
    

    printf("Enter a name: ");
    scanf("%99s", name);  

    
    int length = 0;
    while (name[length] != '\0') {
        length++;
    }

    
    char array[length][2];  

    
    for (int i = 0; i < length; i++) {
        array[i][0] = name[i];
        array[i][1] = '\0';      
    }

    for (int i = 0; i < length; i++) {
        printf("%s\n", array[i]
    }

    return 0;
}
