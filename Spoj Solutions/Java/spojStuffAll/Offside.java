package spojPrograms;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Offside {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(),
				pq2 = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		int Adist,Ddist;
		int A=5,D=5;
		while(true)
		{
			A = sc.nextInt();
			D = sc.nextInt();
			
			if(A==0&&D==0)
			{
				break;
			}
			for(int j=0;j<A;j++)
			{
				pq1.add(sc.nextInt());
			}
			for(int j=0;j<D;j++)
			{
				pq2.add(sc.nextInt());
			}
			
			if(offside(pq1.poll(), pq2.poll(), pq2.poll())){
				System.out.println("Y");
			}
			else
				System.out.println("N");
		}
		return;
	}
	
	public static boolean offside(int Adist, int Ddist1, int Ddist2)
	{
		
		return (Ddist1==Ddist2)? Adist < Ddist1 : Adist < Ddist2 ;
		
	}
	

}
