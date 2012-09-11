package spojStuffAll;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Egypt {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a=-1,b=-1,c=-1;
		int triArr[];
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		while(true)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a==0 && b==0 && c==0)
				break;
			l.add(a);
			l.add(b);
			l.add(c);
		    Collections.sort(l); 
		    
		    if(l.get(2) * l.get(2) == (l.get(1) * l.get(1)) + (l.get(0) * l.get(0))) {
		    	System.out.println("right");
		    } else {
		    	System.out.println("wrong");
		    }
		    l.clear();
		}
	}
	
	
}