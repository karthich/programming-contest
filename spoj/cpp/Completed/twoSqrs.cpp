#include <stdio.h>
#include <math.h>

#define SIEVE_LIMIT 100000
#define NUM_PRIMES 9592
int primes[NUM_PRIMES];


void squares (long long num) {
  bool good = true;

  for(long long i=1; i*i <= num ;i ++) {
      int ct = 0;
      while(num % i == 0) {
        ct++;
        num = num/i;
      }

      if((i % 4 == 3) && (ct % 2 == 1)) {
          good = false;
          break;
      }
  }

  if(good)
    printf("Yes\n");
  else
    printf("No\n");
}
int main()
{
  int testCases;
  long long int num;
  scanf("%d",&testCases);

  while(testCases--) {
    scanf("%lld",&num);
    squares(num);
  }

}
