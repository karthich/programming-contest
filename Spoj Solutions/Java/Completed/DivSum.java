
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int NMAX = 500001;
	public static boolean P[] = new boolean[NMAX];
	//public static int Pr[] = new int[1300];
	public static int Pr[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223
								,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457
								,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709};




	public static final int pr_count = 127;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,ip;
		Scanner in1 = new Scanner(System.in);
		//System.out.println();
		
		N = in1.nextInt();
		long ans[] = new long[N];
		for(int i=0;i<127;i++){
			P[Pr[i]]= true;
		}
		
		for(int i=0;i<N;i++){
			ip = in1.nextInt();
			if(ip==1){
				ans[i] = 0;
				continue;
			}
			else if(P[ip]){
				ans[i] = 1;
				continue;
			}
			ans[i] = divsum(ip);
		}
		
		for(int i=0;i<N;i++){
			System.out.println(ans[i]);
		}
		
	}
	
	/*public static void sieve(){
		//int sq =(int) Math.sqrt(NMAX);
		P[2]=true;
		 
		Pr[pr_count++]=2;
		for(int i=3;i<=707;i+=2){
			if(P[i]){
				continue;
			}
			//System.out.println(Pr[pr_count]);
			Pr[pr_count++] = i;
			
			for(int j=i*i;j<1000;j+=i){
				P[j] = true;
			}
		}
		System.out.println(pr_count);
		System.out.println("Sieve Done");
	}*/
	

	
	/*public static long divsum(int numbers){
		int n = numbers,count=0;
		long prodOfSum = 1;
		System.out.println("Divsum is called");
		for(int i=0;i<pr_count;i++){
			while(n>1){
				if(n%Pr[i]==0){
					count++;
					n/=Pr[i];
				}
				else
					break;
			}
			//System.out.println(Pr[i] + "^" + count);
			prodOfSum*=gp(count,Pr[i]);
			count =0;
			if(n<=1){
				break;
			}
		}
		
		return prodOfSum-numbers;
	}*/
	
	public static long divsum(int numbers){
		int n = numbers,count=0;
		long prodOfSum = 1;
		
		long gpsum=1,term=1;
		
		for(int i=0;i<pr_count;i++){
			while(n>1){
				if(n%Pr[i]==0){
					count++;
					n/=Pr[i];
					term*=Pr[i];
					gpsum+=term;
				}
				else
					break;
			}
			if(count>0){
				//System.out.println(Pr[i]+"^"+count);
				prodOfSum*=gpsum;
				term=1;
				gpsum=1;
				count =0;
				}
			if(n<=1){
				break;
			}
		}
		
		if(prodOfSum==1)
		return prodOfSum;
		
		if(n>1){
			//System.out.println(n+"^1");
			prodOfSum*=(1+n);
			P[n] = true;
		}
		
		return prodOfSum-numbers;
	}
	
	/*public static int gp(int n,int r){
		double ans = (Math.pow(r,(n+1))-1)/(r-1);
		return (int) ans;
	}*/
}
