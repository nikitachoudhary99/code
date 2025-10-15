//wap to take input of character whether character is alphabet or digit or special character

#include <stdio.h>

void main() {
    char ch;

    
    printf("Enter a character: ");
    scanf("%c", &ch);

    
    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        printf("The character '%c' is an alphabet.\n", ch);
    }
    else if (ch >= '0' && ch <= '9') {
        printf("The character '%c' is a digit.\n", ch);
    }

    else {
        printf("The character '%c' is a special character.\n", ch);
    }
}
