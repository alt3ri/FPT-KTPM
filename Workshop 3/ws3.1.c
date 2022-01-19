#include <stdio.h>
#include <math.h>
#include <ctype.h>

long long d2b(int decNum){
    long long binNum = 0;
    int p = 0;
    
    while(decNum > 0){
        binNum += (decNum % 2) * pow(10, p);
        ++p;
        decNum /= 2;
    }
    
    return  binNum;
    
}

int main(){
    
    int decNum, remain, rev = 0;
    
    printf("Enter n = ");
    scanf("%d", &decNum);
    
    char c=getchar();
    
    while (isdigit(c)){
        printf("Enter n = ");
        scanf("%d", &decNum);
    }
    
    printf("%d in binary format is %lld", decNum, d2b(decNum));
    
    int i, n, r, x, t, split;
    int s = 0;
    
    printf("\n\nEnter n = ");
    scanf("%d", &n);
    
    x = n;
    
    for (;x != 0;){
        split = x % 10;
        s += split;
        x /= 10;
    }
    
    printf("The sum of all digits in  %d is %d", n, s);
    
    t = n;
    
    while (t != 0){
        remain = t % 10;
        rev = rev * 10 + remain;
        t /= 10;
    }
    
    printf("\n\nThe reverse number of %d is %d", n, rev);
    return 0;
}