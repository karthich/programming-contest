#include<stdio.h>


int main() {
	long long int x;
	scanf("%lld",&x);
	if(x%2 == 0) {
		while(x % 2 == 0 && x > 1) {
			x /= 2;
		}
		if(x > 1) {
			printf("NIE\n");
		} else {
			printf("TAK\n");
		}
	} else {
		printf("NIE\n");
	}
	return 0;
}
