
package spojStuffAll;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Stamps {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tCaseNum = sc.nextInt();
		int targetStamps,friendsNum;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int stampCost;
		
		for(int i=0;i<tCaseNum;i++) {
			targetStamps = sc.nextInt();
			friendsNum = sc.nextInt();
			
			for(int j=0;j<friendsNum;j++) {
				stampCost = sc.nextInt();
				pq.add(-1*stampCost);
				
			}
			int answer = minNumOfStamps(pq, targetStamps);
			pq.clear();
			System.out.println("Scenario #" + (i+1) + ":");
			
			if(answer!=-1) {
				System.out.println(answer);
			}
			else {
				System.out.println("impossible");
			}
			System.out.println();
			
		}
			
	}
	
	public static int minNumOfStamps(PriorityQueue<Integer> q,int target){
		
		int sum=0;
		int count=0;
		while(sum < target) {
			if(q.isEmpty()){
				return -1;
			}
				
			else {
				sum += (-1*q.poll());
				count++;
			}
			
		}
		return count;
	}
}