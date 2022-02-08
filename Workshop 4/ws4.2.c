#include<stdio.h>
#include<math.h>
double myPi(double epsi){
    double S = 0;
    double n = 0;
    int i;
    while(1){
        double target = (1/(2*n+1));
        if(fabs(target) <= epsi){
            for(i=0 ; i <= n; i++){
                S = S+(double)(4*pow(-1,i)*1/(2*i+1));
            }
            return(S);
            
        }
        n++;
    }
}

double mySin(double x, double epsi){
    double n = 0;
    int q,k;
    double S = 0;
    while(1){
        double denT = 2*n+1;
        double target = 2*n+1;
        if(fabs(target)<=epsi){
            break;
        }
        n++;
    }
    for(k=0; k <= n; k++){
        double num, den = 1;
        num = pow(x,(2*k+1));
        for(q=1; q <= (2*k+1);q++){
            den=den*q;
            
        }
        S = S + (pow(-1,k)*(num/den));
        
    }
    return(S);
}

double myCos(double x, double epsi){
    int n=0;
    int q, k;
    double S = 0;
    while(1){
        double numT, denT=1;
        int i;
        numT = pow(x,2*n);
        for(i=1;i<=2*n;i++){
            denT = denT*i;
        }
        if(fabs(numT/denT)<=epsi){
            break;
        }
        n++;
    }
    for(k=0; k <= n; k++){
        double num, den = 1;
        num = pow(x,2*k);
        for(q=1; q <= 2*k; q++){
            den = den*q;
        }
        S = S+(pow(-1,k)*(num/den));
    }
    return(S);
}

int main(){
    double epsi,x;
    scanf("%lf", &epsi);
    printf("PI = %lf", myPi(epsi));
}