#include<stdio.h>
#include<stdlib.h>

void nhap(int a[], int *n){
    scanf("%d", n);
    int i;
    for(i = 0; i< *n; i++)
        a[i] = 10 + (rand() % 91);
}

void hienthi(int a[], int n){
    int i;
    for(i = 0; i< n; i++){
        printf("%d   ", a[i]);
    }
    printf("\n");
}

void sort(int a[], int n){
    int i, j, x;
    for(i = 1; i < n; i++){
        x = a[i];
        j = i;
        while(j > 0 && x < a[j-1]){
            a[j] = a[j-1];
            j--;
        }
        a[j] = x;
    }
}

int main(){
    int a[100]; int n;
    nhap(a, &n);
    printf("%d random numbers before sorting: \n", n);
    hienthi(a, n);
    printf("after sorting: \n");
    sort(a, n);
    hienthi(a, n);
}
