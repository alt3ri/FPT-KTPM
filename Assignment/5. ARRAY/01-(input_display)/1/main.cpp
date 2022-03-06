#include <stdio.h>
#include <stdlib.h>
int main(){
    float a[100]; int n, i;
    scanf("%d",&n);
    printf("Enter %d float numbers: ", n);
    for(i=0;i<n;i++)  scanf("%f",&a[i]);
    printf("\nList of numbers entered is: ");
    for(i=0;i<n;i++)  printf("%.2f ",a[i]);
    printf("\n");
    return(0);
  }
