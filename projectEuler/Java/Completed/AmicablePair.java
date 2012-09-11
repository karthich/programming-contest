package projectEulerStuff;


public class AmicablePair {

	/**
	 * @param args
	 */
	static int Pr[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divsumLocal;
		int sum=0;
		for(int i=1;i<10000;i++)
		{
			divsumLocal  = Divsum(i);
			if(Divsum(divsumLocal)==i&&divsumLocal!=i)
			{
				System.out.println("" + divsumLocal +" "+ i);
				sum+=(divsumLocal + i);
				
			}
		}
		System.out.println(sum / 2);
	}
	static int Divsum(int numbers)
	{
		int n = numbers,count=0;
		int prodOfSum = 1,gpsum=1,term=1;
		for(int i=0;i<Pr.length;i++)
		{
			while(n>1)
			{
				if(n%Pr[i]==0)
				{
					count++;
					n/=Pr[i];
					term*=Pr[i];
					gpsum+=term;
				}
				else
					break;
			}
			if(count>0)
			{
				prodOfSum*=gpsum;
				term=1;
				gpsum=1;
				count=0;
			}
			if(n<=1)
			break;
		}

		if(prodOfSum==1)
			return prodOfSum;
		
		if(n>1)
			prodOfSum*=(1+n);
			
		
		return prodOfSum-numbers;
	}

}
/*// DivSum.cpp : Defines the entry point for the console application.
//

#include<stdio.h>
#include<stdlib.h>
#include<stdint.h>
#define NMAX 500001

int Pr[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,
				    227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,
					463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709};
int P[NMAX] = {0};
int pr_count=127;


long divsum(int numbers)
{
	
	int n=numbers,count=0,i;
	long prodOfSum = 1,gpsum=1,term=1;

	for(i=0;i<pr_count;i++)
	{
		while(n>1)
		{
			if(n%Pr[i]==0)
			{
				count++;
				n/=Pr[i];
				term*=Pr[i];
				gpsum+=term;
			}
			else
				break;
		}
		if(count>0){
			prodOfSum*=gpsum;
			term=1;
			gpsum=1;
			count=0;
		}
		if(n<=1)
			break;
	}

	if(prodOfSum==1)
		return prodOfSum;
	
	if(n>1)
	{
		prodOfSum*=(1+n);
		P[n] = 1;
	}
	return prodOfSum-numbers;
}


int main()
{
	int N,ip,i;
	scanf("%d",&N);
	long *ans =(long*) calloc(N,sizeof(long));
	for(i=0;i<127;i++)
	{P[Pr[i]] = 1;}
	
	for(i=0;i<N;i++)
	{
		scanf("%d",&ip);
		if(ip==1)
		{
			ans[i] = 0;
			continue;
		}
		else if(P[ip])
		{
			ans[i] = 1;
			continue;
		}
		ans[i] = divsum(ip);
	}

	for(i=0;i<N;i++)
	{
		printf("%ld\n",ans[i]);
	}
	return 0;
}

*/