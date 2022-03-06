#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
//===================================
int main()
  { char str[200]; 
    printf("Enter the string : ");
    fflush(stdin);
    gets(str);
    printf("The string entered is:  %s\n", str);
    return 0;
  }
