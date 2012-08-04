package spojStuffAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * The first line of the input file contains an integer T specifying the number of test cases. 
 * Each test case is preceded by a blank line.
 * Each test case consists of exactly one line. The line represents an equation of the form 
 "number + number = number", where each number is a positive integer. 
 One part of the equation will be replaced by the string "machula". 
 The string always covers a contiguous non-empty sequence of digits, possibly even an entire number. 
 You may assume that for each equation in the input there will be exactly one way to fill in the missing digits.
 
 For each test case, the output shall contain one line of the form "number + number = number". 
 The line must represent the equation from that test case with all missing digits filled in.
 */
public class Absys {
	
	public static void main(String[] args)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int numTestCases = 0;
		try {
			numTestCases = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dirtyEquation = new String();
		for(int i=0;i<numTestCases;i++)
		{
			try{
				br.readLine();
				dirtyEquation = br.readLine();
			} catch(NumberFormatException e){
				e.printStackTrace();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
			
			absys(dirtyEquation);
		}
		return;
			
	}

	
	static void absys(String dirtyEquation)
	{
		int eqnLength= dirtyEquation.length();
		StringBuilder cleanEquationBld = new StringBuilder();
		for(int i=0;i<eqnLength;i++)
		{
			Character ch = dirtyEquation.charAt(i);
			if(ch!='m')
			{
				cleanEquationBld = cleanEquationBld.append(ch);
			}
			else
			{	
				i+=6;
				cleanEquationBld = cleanEquationBld.append("\\");
			}
		
		}
		String cleanEqn = new String(cleanEquationBld);
		//System.out.println(cleanEqn);
		String cleanEqnParts[] = cleanEqn.split("[+=]");
		int numArray[] = new int[3];
		int missing = -1;
		int i=0;
		for(String a : cleanEqnParts)
		{
			try
			{
				a = a.trim();
				numArray[i] = Integer.parseInt(a);
			}
			catch(NumberFormatException e)
			{missing = i;}
			i++;
		}
		switch(missing)
		{
		case 0: System.out.println((numArray[2] - numArray[1]) + " + " + numArray[1]+ " = " +numArray[2]);
				break;
		case 1: System.out.println((numArray[0] + " + " + (numArray[2] - numArray[0]) + " = " +numArray[2]));
				break;
		case 2: System.out.println((numArray[0] + " + " + numArray[1]+ " = " + (numArray[0]+ numArray[1])));
				break;
		default: System.out.println((numArray[0] + " + " + numArray[1]+ " = " +numArray[2])); 
		}
		
	}
}
		



