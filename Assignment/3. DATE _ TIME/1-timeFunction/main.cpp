#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main ( ) {
  long t = time(NULL)/(3600*24*365);
  printf(" the number of seconds since midnight Jan 1, 1970 is (int)time(NULL)/(3600*24*365) %ld\n", t);

  return 0;
}

