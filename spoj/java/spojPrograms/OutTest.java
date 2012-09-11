package spojStuffAll;

import java.io.*; 

public class OutTest {
	
	public static void main(String[] args) throws IOException { 
		//PrintStream out = new PrintStream(new BufferedOutputStream(System.out)); 
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("OutTest.out"))); 
		long startTime = System.currentTimeMillis(); 
		for (int i=0; i<50000; i++) out.println(i); 
			long endTime = System.currentTimeMillis(); 
			out.println("Time elapsed: " + (endTime-startTime)/1000.0 + " seconds."); 
			out.close(); 
		} 
} 
