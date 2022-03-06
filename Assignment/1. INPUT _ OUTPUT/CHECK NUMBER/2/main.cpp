#include <stdio.h>
#include <stdlib.h>

int inputInteger(int &n){ 
  char ch;
   fflush(stdin);
   printf("Input integer n = ");
   scanf("%d%c", &n, &ch);
   fflush(stdin);
   if(ch == '\n' || ch == ' ')
     return(1);
      else
        return(0);     
 }

int inputFloat(float &x){ 
  char ch;int i;
   fflush(stdin);
   printf("Input float x = ");
   scanf("%f%c", &x, &ch);
   fflush(stdin);
   if(ch == '\n' || ch == ' ')
     return(1);
      else
        return(0);     
 }

int main(){ 
  int choice; 
   int n, k; float x;
    printf("Choose one of the following options:\n");
    printf("1. Input positive integer\n");
    printf("2. Input float number\n");
    printf("0. Exit\n");
    printf("Your selection (0 -> 2): ");
    scanf("%d",&choice);
    switch(choice){ 
          case 0: 
            printf("Good bye, have a nice day!\n");
            break;
          case 1: 
            k = inputInteger(n);
            if(k == 1)
              printf("Valid input\n");
            else
              printf("invalid input\n");
              break;
          case 2: 
            k = inputFloat(x);
            if(k == 1)
              printf("Valid input\n");
            else
              printf("invalid input\n");
              break;
          default: printf("**Invalid choice. Try again.**\n");
        }
      return 0;
    }
