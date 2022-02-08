#include <stdio.h>
#include <math.h>

int main(){
    float a,b,c,d,k;
    scanf("%f\n%f\n%f\n%f",&a,&b,&c,&d);
    printf("1. Test saving account");
    printf("\nprincipal = %1.0f\nAnnual rate = %0.1f\nNo. of years = %1.0f\nprincipal = %0.2f",a,b,c,a);
    for(int i=1; i<=c; i++){
        a=a*(1+b);
    }
    printf("\namount after %.0f years = %.2f",c,a);
    printf("\n\n2. Investment calculation");
    printf("\nfuture = %.0f\nAnnual rate = %.1f\nNo. of years = %.0f",d,b,c);
    for(int m =1; m<=c; m++){
         d=d/(1+b);
    }
    printf("\nprincipal should be = %.2f",d);
}