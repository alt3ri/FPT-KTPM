#include<stdio.h>
#include<string.h>

void revstr(char*str1){
    int i,len,temp;
    len=strlen(str1);
    
    for (i=0;i<len/2;i++){
        temp =str1[i];
        str1[i]=str1[len-i-1];
        str1[len-i-1]=temp;
    }
}

int main(){
    char str[20];
    
    scanf("%s",str);
    printf("The original string: %s",str);
    revstr(str);
    printf("\nThe reverse string: %s",str);
    return 0;
}
