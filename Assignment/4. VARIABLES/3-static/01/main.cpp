#include <stdio.h>

void thu()
 {static int n=1;
  printf("\n%d",n);
  n+=1;
 }
int main()
 { int i;
   for(i=1;i<=10;i++) thu();
   printf("\n\n");
   return(0);
 }
