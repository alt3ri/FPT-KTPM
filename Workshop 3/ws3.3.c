#include <stdio.h>
int main(){
    int m,n;
    printf("Enter m, n = ");
    scanf("%d%d",&m,&n);
    int r,i,luu;
    for(i = m;i <= n;i++){
        luu=i;
        int sum=0;;
        while(luu){
            r = luu % 10; 
            sum = (sum*10 ) + r;
            luu = luu/10;
            
        }
        if(i==sum){
            printf("%d ",i);
        }
}
}