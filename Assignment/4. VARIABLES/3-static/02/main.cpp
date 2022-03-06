/*#include <stdio.h>
#include <conio.h>

int count(int i);
int main(void){ 
  scanf("%d", &i);
  do{ 
    count(0);
    } while(!kbhit());
  printf("%d\n", count(1));
  return 0;

}
int count(int i){ 
  static int c=0;
  if(i) return c;
    else
      c++;
  return 0;
}*/
#include <stdio.h>

void thu(){
  static int n=1;
  printf("\n%d",n);
  n+=1;
}
int main(){ 
  int i, z;
  scanf("%d", z);
  for(i=1;i<=10;i++) thu();
  printf("\n\n");
  return(0);
}

