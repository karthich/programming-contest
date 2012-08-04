package spojStuffAll;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class StPar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   int testCaseNum = 0;
		   String caseList[];
		   String x = "";
		try {
			while((x = br.readLine()).compareTo("0")!=0)
			   {
					testCaseNum = Integer.parseInt(x);
					x = br.readLine();
					caseList = x.split("[ ]");
					stpar(caseList,testCaseNum);
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
		
		public static void stpar(String[] ipStr,int testCaseNum)
		{
						 
			
			Stack<Integer> ps = new Stack<Integer>();
			//ps.ensureCapacity(testCaseNum);
			boolean state = true;
			int need =1;
			
			for(int i=0;i<ipStr.length;i++)
			{
				while(!ps.isEmpty()&&(ps.peek()==need))
				{
					need++;
					ps.pop();
				}
				if(Integer.parseInt(ipStr[i])==need)
				{
					need++;
				}
				else if(!ps.isEmpty() && (ps.peek() <Integer.parseInt(ipStr[i])))
				{
					state = false;
					break;
				}
				else
				{
					ps.push(Integer.parseInt(ipStr[i]));
				}
			}
						
			if(state)
				System.out.println("Yes");
			else
				System.out.println("No");
			
			return;
			
		}

	}


