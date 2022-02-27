#include<stdio.h>
#include<stdlib.h>

void produce(int x){
    int heads,tails;
    heads=0;
    tails=0;
    for (int i=1; i<=x;i++){
        if(rand()%2==0){
            heads+=1;
    }else{
        tails+=1;
    }
    }
    printf("Number of tosss: %d",x);
    printf("\nNumber of heads: %d",heads);
    printf("\nNumber of tails: %d",tails);
    printf("\nPercentage of heads for all tosses: %.2f",(((float)heads)/x)*100);
    
}
int main(){
    int opt,tossNum;
    // printf("Select options: \n1. Start tossing\n0.Exit");
    // printf("\nYour selection (0 -> 1): ");
    // scanf("%d",&opt);
    // if(opt==1){
        printf("\nEnter number of tosse: ");
        scanf("%d",&tossNum);
        produce(tossNum);
    // }
}
