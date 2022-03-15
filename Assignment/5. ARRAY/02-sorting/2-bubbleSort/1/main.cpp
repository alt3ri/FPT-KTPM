#include<stdio.h>
#include<stdlib.h>

void nhap(int a[], int *n){
    scanf("%d", n);
    int i;
    for(i = 0; i < *n; i++)
        a[i] = 10 + rand() % 91;
} 

void hienthi(int a[], int n){
    int i;
    for(i = 0; i< n ; i++){
        printf("%d   ", a[i]);
    }
}

void sort(int a[], int n){
    int i, j;
    int t;
    for(i = 1; i <= n-1; i++){
        for(j = n -1; j >= i; j--){
            if(a[j] < a[j-1]){
                t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
        }
    }
}
int main(){
    int n; int a[100];
    nhap(a, &n);
    printf("%d random numbers before sorting:\n", n);
    hienthi(a, n);
    printf("\nafter sorting:\n");
    sort(a, n);
    hienthi(a, n);
}
