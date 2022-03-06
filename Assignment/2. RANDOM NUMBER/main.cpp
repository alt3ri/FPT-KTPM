#include <stdlib.h>
#include <stdio.h>
#include <time.h>

// rand(a, b)
void randNumbers(int a, int b, int n){ 
   printf("\n%d  random numbers between  %d   and   %d:\n\n",n,a, b );
   int k;
   for (int i = 0; i < n ; i++){ 
      k = a + rand() % (b + 1 - a);
      printf("%d  ",  k); 
   }
   printf("\n\n");
}
// randFloat(a, b)
void randNumbers(float a, float b, int n){
   printf("\n%d  random numbers between  %.1f   and   %.1f:\n\n",n,a, b );
   float x;
   for (int i = 0; i < n ; i++){ 
      x = a + ((float) rand()) / RAND_MAX*(b - a);
      printf("%5.2f  ",  x); 
   }
   printf("\n\n");
}
int main ( ){
   int  z, n =10, a = 6, b = 100;
   //printf("Choose option 1 or 2: ");
   scanf("%d", &z);
   switch(z){
      case 1: 
         printf("RAND_MAX = %d\n", RAND_MAX);
         srand(time(NULL));
         //randNumbers(a,b,n);
         break;
      case 2: 
         printf("RAND_MAX = %d\n", RAND_MAX);
         srand(time(NULL));
         //randNumbers((float) a,(float) b,n);   
         break;
   }
   return(0);
}
  
