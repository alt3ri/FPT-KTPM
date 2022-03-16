#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct{
    char    name[100];
    int     age;
} PType;
typedef int so_nguyen;
void inputP(PType *t){
    scanf("%[^|]|%d ", t->name, &(t->age));
}
void displayP(PType t){
    printf("%20s | %5d\n", t.name, t.age);
}
void inputL(PType a[], so_nguyen *n){
    scanf("%d ", n);
    so_nguyen i;
    for(i=0; i<*n; i++)
        inputP(a+i);  //inputP(&a[i]);
}
void displayL(PType a[], so_nguyen n){
    so_nguyen i;
    for(i=0; i<n; i++)
        displayP(*(a+i));  //display(a[i]);
}
void strsort(PType a[], so_nguyen n){
    so_nguyen i, j;
    PType tmp;
    for(i=n-1; i>=0; i--)
        for(j=0; j<i; j++)
            if(strcmp(a[j].name,a[j+1].name)>0){
                tmp=a[j];   a[j]=a[j+1];    a[j+1]=tmp;
            }
}
int main(){
    so_nguyen n;
    PType   a[100];
    inputL(a, &n);
    strsort(a, n);
    displayL(a, n);
}