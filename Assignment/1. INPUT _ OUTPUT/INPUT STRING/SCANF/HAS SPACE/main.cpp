#include <stdio.h>
#include <stdlib.h>

int main(){ 
    char str[200]; 
    int choice;
    scanf("%d%*c", &choice);
    switch(choice){
      case 1:
        fflush(stdin);
        printf("Enter the string (only the characters A, B, and C): ");
        scanf("%[ABC]",str);//chi doc cac ky tu A, B C
        printf("The string entered is:  %s\n", str);
        break;
      case 2:
        fflush(stdin);
        printf("Enter the string (accept the letters 'A' through 'F'): ");
        scanf("%[A-F]",str);//chi doc cac ky tu A, B, C, E, E, F
        printf("The string entered is:  %s\n", str);
        break;
      case 3:
        fflush(stdin);
        printf("Enter the string until encountering the '\\n' character: ");
        scanf("%[^\n]",str);//doc cho den khi gap ky tu '\n'
        printf("The string entered is:  %s\n", str);
        break;
    
    }
    return(0);
  }
