#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void hienthi(int* a, int n){
    int i;
    for(i = 0; i <n; i++){
        printf("%d ", a[i]);
    }
    printf("\n");
}

int main(){
    int n;
    scanf("%d", &n);
    
    int* a;
    a = (int*)malloc(n*sizeof(int));
    int i;
    for(i = 0; i < n; i++){
        a[i] = i;
    }
    printf("\nNumbers in the array: ");
    hienthi(a, n);
    
    
    int* b;
    b = (int*)malloc(n*sizeof(int));
    memcpy(b, a, n*sizeof(int));
    printf("\nNumbers in the copied memory: ");
    hienthi(b, n);
}
