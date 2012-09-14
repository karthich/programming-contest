package projectEulerPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.xml.crypto.AlgorithmMethod;

public class NameScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("D:\\workspace\\spojstuff\\names.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String nameLine = null;
		ArrayList<String> ls = new ArrayList<String>();
		try
		{
			while((nameLine = sc.next())!=null)
			{
				ls.add(nameLine);
			}
		}
		catch(NoSuchElementException e)
		{
		 
		}
		System.out.println(ls.size());
		Collections.sort(ls);
		System.out.println(ls.size());
		//System.out.println(ls);
		int i=1;
		long nameSum = 0;
		long currentnameScore = 0;
		
		for(String a:ls)
		{
			currentnameScore = findScore(a.trim());
			nameSum =nameSum + (i*currentnameScore);
			if(a.compareTo("COLIN")==0)
			{				
				System.out.println("Namescore of " + a + " is "
						+ (i * currentnameScore));
				System.out.println(i);
			}
			i++;
			//System.out.println(nameSum);
		}
		System.out.println(nameSum);
		
	}
	
	static int findScore(String ip)
	{
		int len = ip.length();
		int sum = 0;
		Character ch;
		for(int i=0;i<len;i++)
		{
			ch = ip.charAt(i);
			sum +=findPos(ch);
		}
		return sum;
	}
	
	static int findPos(Character ch)
	{
		int base = (int) 'A';
		int posCh = (int) ch;
		//System.out.println("ch= " + ch + " Number " + (posCh - base + 1));
		return posCh-base+1;
		
	}

}
