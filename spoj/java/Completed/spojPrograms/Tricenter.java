package spojPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tricenter {

	/**
	 * http://www.spoj.pl/problems/TRICENTR/
	 */
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   int testCaseNum = 0;
		   String caseList[];
		   String x = "";
		try {
			x = br.readLine();
			testCaseNum = Integer.parseInt(x);
			for(int i=0;i<testCaseNum;i++)
			   {
					x = br.readLine();
					caseList = x.split("[ ]");
					
					tricenter(caseList);
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static void tricenter(String[] caseList)
	{
		float a = Float.parseFloat(caseList[0]),da = Float.parseFloat(caseList[1]),
				db = Float.parseFloat(caseList[2]),dc = Float.parseFloat(caseList[3]);
		
		float s = (3*da*a)/2;
		float b = ((2*s)/(3*db))
				,c = ((2*s)/(3*dc));
		float R = (a*b*c)/(4*s);
		float ho =(float) Math.sqrt(Math.abs(9*R*R - (a*a + b*b + c*c)));
		System.out.format("%.3f %.3f", s,ho);
	}

}
