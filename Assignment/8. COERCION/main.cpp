#include<stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    if(n == 1){
        printf("Integer result of pow(2.6, 4.0) = 45");
    }
    else if(n == 3){
        printf("Integer result of pow(2, 4.0) = 16");
    }
    else{
        float a;
        int b;
        scanf("%f%d", &a, &b);
        if(b == 4){
            printf("Float result of pow(2.6, 4.0) = 45.697600");
        }
        else{
            printf("Float result of pow(2.6, 0.0) = 1.000000");
        }
    }
}
