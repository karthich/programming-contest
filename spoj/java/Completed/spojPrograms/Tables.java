package spojPrograms;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Tables {

	/**
	 * http://www.spoj.pl/problems/AE1B/
	 */
	public static void main(String[] args) {
		int n,k,s;
		Scanner in1 = new Scanner(System.in);
		
		n = in1.nextInt();
		k = in1.nextInt();
		s = in1.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(n);
		for(int i=0;i<n;i++)
		{
			q.offer(-1*in1.nextInt());
			
		}
				
		int targetSum = k*s;
		int count=0;
		while(targetSum>0)
		{
			int ai = -1*q.poll();
			targetSum-=ai;
			count++;
		}
		System.out.print(count+" ");
		return;

	}

}
