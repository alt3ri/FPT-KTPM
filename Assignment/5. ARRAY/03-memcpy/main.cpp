#include<stdio.h>
#include<string.h>

int main(){
    int a[100], b[100], i;
    int n;
    scanf("%d", &n);
    
    for(i = 0; i<n; i++){
        a[i] = 0;
        b[i] = i;
    }
    memcpy(a, b, n*sizeof(int));
    for(i = 0; i<n; i++)
        printf("%d ", a[i]);
    printf("\n");
    return 0;
}
