#include <stdio.h>
#include <math.h>

int n, i, gt;
float s3, r;
long s1, s2;

int main(){
    printf("Enter n: ");
    scanf("%d", &n);
    if (n > 5){    
        s1 = 0;
        i = 1;
        for(int i = 1; i <=n; i++){
            s1 = s1 + i;
        } 
        printf("\ns1 = %ld", s1);

    } else {
        printf("n must be > 5, please reenter!");
        printf("\nEnter n: ");
        scanf("%d", &n);      
        s1 = 0;
        i = 1;
        for(int i = 1; i <=n; i++){
            s1 = s1 + i;
        } 
        printf("\ns1 = %ld", s1);

    }

    gt = 1;

    for(int i=1;i<=n;i++){  
      gt = gt *i;  
    }  
    printf("\ns2 = %d", gt);

    while(i <= n){
         s3 = s3 + 1.0 / i;
        i++;
     }
    printf("\ns3 = %0.4f", s3);

    printf("\n");

    printf("\nEnter n: ");
    scanf("%d", &n);
    if(n < 2){
        printf("\n%d is not a prime number", n);
        return 0;
    }
    int count = 0;
    for(int i = 2; i <= sqrt(n); i++){
        if(n % i == 0){
            count++;
        }
    }
    if(count == 0){
        printf("\n%d is a prime number", n);
    }else{
        printf("\n%d is not a prime number", n);
    }
}