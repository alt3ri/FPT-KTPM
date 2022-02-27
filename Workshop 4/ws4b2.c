#include <stdio.h>
#include <math.h>

int root(double a, double b, double c){
    float x1,x2,delta;
    delta = b*b - 4*a*c;
    if(delta<0){
        printf("There are no real roots \n");
    }else if(delta>0){
        x1=(-b+sqrt(delta))/(2*a);
        x2=(-b-sqrt(delta))/(2*a);
        printf("2. Solve the equation \n There are 2 real roots: x1 = %.6lf, x2 = %.6lf",x1,x2);
    }else{
        x1 = -b/(2*a);
        printf("2. Solve the equation \nThere is one real root: x0 = %.6lf",x1);
    }
    return 0;
}

int main(){
    double a,b,c;
    scanf("%lf",&a);
    scanf("%lf",&b);
    scanf("%lf",&c);
    root(a,b,c);
}
