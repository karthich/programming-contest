package spojPrograms;

import java.util.Arrays;
import java.util.Scanner;



public class StoneGame {
	
  public static void main (String[] args) {
    
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	int piles;
	int pileArr[];
	for(int i=0;i<t;i++) {
	  piles = sc.nextInt();
	  pileArr = new int[piles];
	  for(int j=0;j<piles;j++) {
		 pileArr[j] = sc.nextInt();
		 
	  }
	  System.out.println("ALICE");
	  pileArr = null;
	}
		
  }
  
  
}