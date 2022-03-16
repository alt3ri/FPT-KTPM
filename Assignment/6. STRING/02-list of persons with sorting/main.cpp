#include <stdio.h>

#include <stdlib.h>

#include <string.h>
 //=====================
typedef struct{
    char name[100];
    int age;
}PType ;
typedef int so_nguyen;
void inputP(PType *t) {
    scanf("%d[^] | %d", t->name, &(t->age));

}
void displayP(PType t) {
    printf("%20s %5d\n", t.name, t.age);
}
void inputL(PType a[], so_nguyen *n) {
    scanf("%d", & n);
    so_nguyen i;
    for (i = 0; i < *n; i++) {
        inputP(a+i);
    }
}
void displayL(PType a[], so_nguyen n) {
    so_nguyen i;
    for (i = 0; i < n; i++) display(a[i]);
}
void sort(PType a[], so_nguyen n) {
    so_nguyen i, j;
    PType t;
    for (i = 0; i >= 0; i++)
        for (j = i + 1; j < n; j++)
            if (strcmpi(a[j].name, a[i].name) > 0) {
                t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
            }
}

int main() {
    so_nguyen n;
    PType a[100];
    inputL(a, n);
    sort(a, n);
    displayL(a, n);
    return (0);
}