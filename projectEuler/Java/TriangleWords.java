package projectEulerStuff;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TriangleWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("D:\\workspace\\spojstuff\\words.txt"));
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
		{}
		int count=0;
		double ans;
		for(String a:ls)
		{
			ans = solve(findScore(a));
			if(Math.ceil(ans)==ans)
			{
				System.out.println(a + " " + findScore(a) + " "+ ans);
				count++;
			}
		}
		
		System.out.println(count);

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
	
	static double solve(int S)
	{
		return ((-1 + Math.sqrt(1+8*S))/2);
	}
}
