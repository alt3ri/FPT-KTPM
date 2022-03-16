#include <stdio.h>
#include <string.h>
int main()
{
 char a[100], b[100];
 char hoa[100], la[]="La";
 hoa[0]='\0';
 strcat(hoa,"Hoa ");
 int compare;
 scanf("%s%s",a,b);
 strcat(a," La");
 strcat(hoa,b);
 compare =strcmp(a, hoa);
 printf("strcmp(\"%s\",\"%s\") = %d",a,hoa,compare);
    
}