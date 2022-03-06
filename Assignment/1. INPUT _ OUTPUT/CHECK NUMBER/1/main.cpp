#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

int main()
{
   int n, a; char ch; 

   printf("Input integer n = ");
   scanf("%d%c",&n,ch);

   if(ch == '\n' || ch == ' ')
      printf("InCorrect input!\n");
   if(isalpha(ch))
         printf("Trailing character\n");
         printf("n = %d\n",n);	
         printf("ch = %d\n",ch);	
   return(0); 
}
