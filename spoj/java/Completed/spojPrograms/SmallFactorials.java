package spojStuffAll;

import java.util.Scanner; 
import java.lang.StringBuilder;
import java.lang.Integer;
/**
	 * INPUT
	 * The input consists of N cases (equal to about 10000). The first line of the input contains only 
	 * positive integer N. Then follow the cases. Each case consists of exactly one line with two positive 
	 * integers separated by space. These are the reversed numbers you are to add.
	 * 
	 * OUTPUT
	 * For each case, print exactly one line containing only one
	 * integer - the reversed sum of two reversed numbers. 
	 * Omit any leading zeros in the output.
	 * 
	 */


public class SmallFactorials {

	public static void main(String[] args) {
		int N,ans[];
		StringBuilder a,b;
		Scanner in1 = new Scanner(System.in);
		N = in1.nextInt();
		ans = new int[N];
		for(int i=0;i<N;i++){
			a = new StringBuilder(in1.next());
			b = new StringBuilder(in1.next());
			ans[i] = Integer.parseInt(addRev(new String(a.reverse()),new String(b.reverse())));
		}
		
		for(int i=0;i<N;i++){
			System.out.println(ans[i]);
		}
	}
	
	public static String addRev(String a, String b){
		int x = Integer.parseInt(a),y = Integer.parseInt(b);
		//System.out.println(x + " " + y);
		StringBuilder result = new StringBuilder(String.valueOf(x + y));
		//System.out.println(result);
		return (new String(result.reverse()));
	}
	
	
}


