// Prime1.cpp : Defines the entry point for the console application.
//


#include<math.h>
#include<stdio.h>
#include<stdlib.h>

#define SIEVE_LIMIT 31627
#define TEST_CASES 10
#define PRIME_LIMIT 100001
#define LENGTH 100000
#define NUM_PRIMES 3402

using namespace std;

int primes[NUM_PRIMES];

void prime1(long a, long b);
void sieve();

int main()
{
	int t,i,j;
	scanf("%d",&t);
    long  a=0,b=0;
	sieve();
	for(i=0;i<t;i++)
	{
        scanf("%ld %ld",&a,&b);
        prime1(a,b);
    }
	return 0;
}

void sieve()
{
	int pr_count = 3,i,j,limit;

	primes[0] = 2;
	primes[1] = 3;
	primes[2] = 5;
	primes[3] = 7;
	int isPrime = 1;

	for(i=7;i<SIEVE_LIMIT;i+=2)
	{
		limit = (int)sqrtl(i);
		for(j=0;primes[j]<=limit;j++)
		{
			if(i%primes[j]==0)
			{
				isPrime = 0;
				break;
			}
			else
				continue;
		}
		if(isPrime)
		{
		    pr_count++;
			primes[pr_count] = i;
		}
		isPrime = 1;
	}

}


void prime1(long a,long b)
{


	int range =(int) b- a + 1,limit,*prime,i,j,k;

	prime = (int*) calloc(range, sizeof(int));

	for(i=0;i<range;i++)
	{
	    if(a+i==1)
	    {
	        prime[i] = 2;
	        continue;
	    }
	    if(a+i==2)
	    {
	        prime[i]=1;
            printf("%ld\n",a+i);
            continue;

	    }
	    else if((a+i)%2==0)
	    continue;

        limit = (int) sqrtl(a+i);
        for(j=0;primes[j]<=limit&&j<NUM_PRIMES;j++)
        {
            if(prime[i]!=2)
            {
                if((a+i)%primes[j]==0)
                {
                    for(k=i;k<=range;k+=primes[j])
                    {
                        prime[k] = 2;
                    }
                    break;
                }
                else
                    continue;
            }

        }

        if((a+i)==primes[j]||prime[i]==0)
        {
            prime[i]=1;
            printf("%ld\n",a+i);
        }

	}
}

