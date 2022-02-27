#include<stdio.h>

void out(int num,int den){
    printf("%d/%d\n",num,den);
}
void simplify(int num, int den){
    int rever,coun,n,d;
    n=num;
    rever=1;
    if(den<0){
        den*=-1;
        rever=-1;
    }
    d=den;
    while (n!=d){
        if(n>d){
            n = n-d;
        }else{
            d=d-n;
        }
    }
    printf("%d/%d",(num/d)*rever,den/d);
}

void display(){
    int num,den;
    printf("Enter numerator : ");
    scanf("%d",&num);
    do{
        printf("Enter denominator : ");
        scanf("%d",&den);
    }while (den==0);
    out(num,den);
    simplify(num,den);
}
int main(){
    display();
}
