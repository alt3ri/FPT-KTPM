#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void FunctionToss(){
	int number, tosses, head = 0, tail = 0;
	printf("Number of tosses: ");
	scanf("%d",&number);
	//srand(time(NULL));
	for (int i = 1; i <= number; i++){
		//tosses=1+rand()%number;
		if (rand()%2 == 1){
			head++;
		} else {
			tail++;
		}
	}
	printf("Number of heads: %d", head);
	printf("\nNumber of tails:\t %d", tail);
	float percen=(float)tosses/number*100;
	printf("\nPercentage of heads for all tosses: %.2f", percen);
}

int main(){
	int check;
	FunctionToss();
	return 0;
}
