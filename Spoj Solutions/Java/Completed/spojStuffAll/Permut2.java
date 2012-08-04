package spojStuffAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Permut2 {

	/**Problem Definition
	 * http://www.spoj.pl/problems/PERMUT2/
	 */
	public static void main(String[] args) 
	{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   int currentTestCaseLen = 0;
		   String caseList[];
		   String x = "";
		try {
			while((x = br.readLine()).compareTo("0")>0)
			   {
					currentTestCaseLen = Integer.parseInt(x);
					x = br.readLine();
					caseList = x.split("[ ]");
					
					permut2(caseList);
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static void permut2(String[] caseList)
	{
		String inversePermute[] = new String[caseList.length];
			for(int i=0;i<caseList.length;i++)
			{
				inversePermute[Integer.parseInt(caseList[i])-1] = ""+(i+1);
				//System.out.println("Comparing " + caseList[i] + (i+1));
				if(Integer.parseInt(caseList[Integer.parseInt(caseList[i])-1])==(i+1))
				{continue;}
				else
				{
					System.out.println("not ambiguous");
					return;
				}
			}
			
			System.out.println("ambiguous");
			return;
	}
}

