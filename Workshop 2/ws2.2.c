#include <stdio.h>
#include <math.h>
int x, y, m, n;

int main(){ 
    while (m<=0|| n<=0){
        printf("Enter m, n = ");
        scanf("%d%d",&m,&n);
    }   
    x=m;
    y=n;
    while(m!=n){
        if(m>n){
            m-=n;
        } else {
            n-=m;
        }
    }
    printf("GCD = %d",m);
    printf("\nLCM = %d",(x*y)/m);
}   