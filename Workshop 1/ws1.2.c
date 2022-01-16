#include <stdio.h>
#include <math.h>

float a, b, c, S1, p, Prmt;

int main(){
    printf("Enter a, b, c: ");
    scanf("%f%f%f", &a, &b, &c);
    if ((a + b > c)&&(a + c > b)&&(b + c >a)) {
        p = (a + b + c) / 2;
        S1 = sqrt(p * (p - a) * (p - b)* (p - c));
        Prmt = a + b + c;
        printf("\nPerimeter = %0.4f", Prmt);
        printf("\nArea = %0.4f", S1);
    } else {
        printf("a, b, c are not sides of a triangle");
    }
    return 0;
}
