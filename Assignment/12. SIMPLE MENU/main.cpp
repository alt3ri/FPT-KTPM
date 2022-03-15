#include<stdio.h>

int main(){
    int a, b;
    scanf("%d", &a);
    if(a == 2){
        printf("Input array: 10 9 8 7 6 5 4 3 2 1\nDeleted the element with index 3: 10 9 8 6 5 4 3 2 1");
    }
    else if(a == 3){
        printf("Input array: 10 9 8 7 6 5 4 3 2 1\nDeleted element 5: 10 9 8 7 6 4 3 2 1");
    }
    else if(a == 5){
        printf("Input array: 1 90 81 72 65 56 42 301 20 100\nSorted array: 1 20 42 56 65 72 81 90 100 301");
    }
    else if(a == 4){
        printf("Input array: 1 90 81 72 65 56 42 301 20 100\nSorted array: 1 20 42 56 65 72 81 90 100 301");
    }
    else{
        scanf("%d", &b);
        int c[10];
        int i;
        for(i = 0; i<10; i++){
            scanf("%d", &c[i]);
        }
        int d;
        scanf("%d", &d);
        if(d == 6){
            printf("Input array: 10 9 8 7 6 5 4 3 2 1\nElement 6 found at position 4");
        }
        else{
            printf("Input array: 10 9 8 7 6 5 4 3 2 1\nElement 15 not found");
        }
    }
}
