#include <stdio.h>
#include <stdlib.h>

int main(){ 
    char str[200]; 
    int choice;
    scanf("%d%*c", &choice);
    switch(choice){
      case 1:
        fflush(stdin);
        printf("Enter the string: ");
        scanf("%s",str);
        printf("The string entered is:  %s\n", str);
        break;
      case 2:
        fflush(stdin);
        printf("Enter the string: ");
        scanf("%s",str);
        printf("The string entered is:  %s\n", str);
        break;
      case 3:
        fflush(stdin);
        printf("Enter the stringer: ");
        scanf("%s",str);
        printf("The string entered is:  %s\n", str);
        break;
    
    }
    return(0);
  }
