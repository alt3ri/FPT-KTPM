#include <stdio.h>
#include <stdlib.h>

void input(float a[], int *n){ 
    scanf("%d",n);
    printf("Enter %d float numbers: ", *n);
    for(int i=0;i<*n;i++)  scanf("%f",&a[i]);
  }
void display(float a[], int n){ 
    printf("\nList of numbers read in: ");
    for(int i=0;i<n;i++)  printf("%.2f ",a[i]);
    printf("\n");
  }

int main(){
    float a[100]; int n;
    input(a,&n);
    display(a,n);
    printf("\n");
    return(0);
  }