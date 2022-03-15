#include<stdio.h>
#include<stdlib.h>

void createData(int a[], int* n){
    int i;
    for(i = 0; i < *n; i++){
        a[i] = 10 + rand() % 91;
    }
}

void display(int a[], int n){
    int i;
    for(i = 0; i < n; i++)
        printf("%d ", a[i]);
}

void sort(int a[], int n){
    int i, j;
    int k;
    for(i = 0; i < n-1; i++){
        for(j = i + 1; j <= n -1; j++){
            if(a[i] > a[j]){
                k = a[i];
                a[i] = a[j];
                a[j] = k;
            }
        }
    }
}

int main(){
    int n;
    scanf("%d", &n);
    int a[100];
    createData(a, &n);
    printf("%d random numbers before sorting:\n", n);
    display(a, n);
    sort(a, n);
    printf("\nafter sorting:\n");
    display(a, n);
    
}
