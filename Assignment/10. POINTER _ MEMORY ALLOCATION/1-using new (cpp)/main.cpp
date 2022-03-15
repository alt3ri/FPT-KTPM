#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
 int * a; int n, i;
 printf("Enter the size of the array n = ");
 scanf("%d",&n);
 a = new int[n];

 for(i=0;i<n;i++) a[i] = i;

 printf("Numbers in the array: ");
 for(i=0;i<n;i++) printf("%d ",a[i]);
 printf("\n");
 delete [] a;

 return(0);
}
