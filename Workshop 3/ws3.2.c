#include <stdio.h>
#include <math.h>

float a,b,c,x1,x2, x;

int main(){
    float delta;
    
    printf("Enter a, b, c = ");
    scanf("%f%f%f", &a, &b, &c);
    
    delta = b * b - 4 * a * c;
    
    if(a == 0){
        printf("no real solution");
        return 0;
    }
    
    if(delta < 0){
        printf("no real solution");
    }
    
    if(delta == 0){
        x = -b / (2 * a);
        printf("x1 = x2 = %.2f", x);
    }
    
    if(delta > 0){
        x1 = (-b - sqrt(delta)) / (2 * a);
        x2 = (-b + sqrt(delta)) / (2 * a);
        printf("x1 = %.2f", x1);
        printf(", x2 = %.2f", x2);
    }
    
    return 0;
}