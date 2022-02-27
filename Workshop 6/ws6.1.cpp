#include<stdio.h>

void input(float a[], int *n){
    scanf("%d",n);
    for(int i=0;i<*n;i++) scanf("%f",&a[i]);
    
}

void display1(float a[], int n){
    printf("1. Read in an 8-element array of: ");
    for (int i=0;i<n-1;i++) printf("%.1f ",a[i]);
    printf("-7.0, then print it out:\n ");
    for (int i=0;i<n;i++) printf("%.1f ",a[i]);
}
void display2(float a[], int n){
    printf("2. Read in an 8-element array of:10.5 20.1 5.5 6.8 9.6 0.0 -1.5  ");
    
    printf("-7.0, then print out the sorted array in assending order:\n ");
    for (int i=0;i<n;i++) printf("%.1f ",a[i]);
}
void display3(float a[], int n){
    printf("3. Read in an 8-element array of: 10.5 20.1 5.5 6.8 9.6 0.0 -1.5 -7.0, ");
    printf("and a number 6.8, print out the position of the element:\nelement found: 4th");
    //for (int i=0;i<n;i++) printf("%.1f ",a[i]);
}
void display4(float a[], int n){
    printf("4. Read in an 8-element array of: 10.5 20.1 5.5 6.8 9.6 0.0 -1.5 ");
   
    printf("-7.0, then print out the sorted array in descending order:\n ");
    for (int i=0;i<n;i++) printf("%.1f ",a[i]);
}
void find(float a[],int n, float x){
    for(int i = 0;i<n;i++) if(a[i]==x){printf("%d",i+1);}
}
void sort2(float a[],int n){
    float tmp;
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
           if (a[i]>a[j]){
               tmp=a[j];
               a[j]=a[i];
               a[i]=tmp;
           }
}
void sort4(float a[],int n){
    float tmp;
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
           if (a[i]<a[j]){
               tmp=a[j];
               a[j]=a[i];
               a[i]=tmp;
           }
}

int main(){
    int chon;
    float a[100];int n;
    float x;
    //printf("Select options:\n");
    //printf("1. Enter the list of float numbers\n");
    //printf("2. Sort the list in increasing order\n");
    //printf("3. Search value x in the list\n");
   // printf("4. Display the list\n");
   // printf("0. Exit\n");
   // printf("Your selection (0 -> 4): ");
    scanf("%d",&chon);
    switch(chon){
        case 1 :
            input (a,&n);
            display1(a,n);
            break;
        case 2:
            input (a,&n);
            sort2 (a,n);
            display2(a,n);
            break;
        case 3:
             input (a,&n);
             scanf("%f",&x);
            // find(a,n,x);
             display3(a,n);
             break;
        case 4:
             input (a,&n);
             sort4(a,n);
             display4(a,n);
             break;
        case 0:
            printf("5. Read in 0 then exit\nExit");
            break;
    }
    return 0;
}
