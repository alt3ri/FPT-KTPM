#include <stdio.h>
#include <math.h>


float myExp(int n, float x)
{
    float sum = 1.0f;
 
    for (int i = n - 1; i > 0; --i )
        sum = 1 + x * sum / i;
 
    return sum;
}


int main()
{
    int n = 1000;
    float x=1.5;
    printf("exp(%.1f) = %f", x,myExp(n, x));
    printf("\nexp(1.5 , 1000) = %f", myExp(n, x));
    printf("\nexp(1.5, 0,000010) = %f",myExp(n,x));
    return 0;
}
