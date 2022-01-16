#include <stdio.h>
#include <math.h>

float a, b, c, x, S1, S2;

int main(){
    
    printf("Enter a: ");
    scanf("%f", &a);
    printf("\nEnter b: ");
    scanf("%f", &b);
    printf("\nEnter c: ");
    scanf("%f", &c);
    printf("\nEnter x: ");
    scanf("%f", &x);
    
    S1 = a*x*x + b*x + c;
    S2 = sqrt(b*b - 4*a*c);
    
    if ((b*b - 4*a*c) > 0){
        printf("S1 = %0.2lf, S2 = %0.2lf", S1, S2);
    } else {
        printf("S1 = %0.2lf, S2 = 0.00", S1);
    }
    
    return 0;
}
