#include<stdio.h>
#include<stdlib.h>
void createData(int a[], int n){
    int i;
    for(i = 0; i <n; i++)
        a[i] = 10 + rand()%91;
}

void sort(int a[], int n){
    int i, j, t;
    for(i = 0; i <n-1; i++){
        for(j = i; j <= n-1; j++){
            if(a[i] > a[j]){
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
    }
}

void hienthi(int a[], int n){
    int i;
    for(i = 0; i<n; i++)
        printf("%d   ", a[i]);
}

int main(){
    int a[100], n;
    scanf("%d", &n);
    createData(a, n);
    printf("%d random numbers before sorting:\n", n);
    hienthi(a, n);
    sort(a, n);
    printf("\nafter sorting:\n");
    hienthi(a, n);
    return 0;
}
