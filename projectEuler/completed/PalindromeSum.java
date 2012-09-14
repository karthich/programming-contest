package projectEulerPrograms;
import java.lang.*;

public class PalindromeSum {

	/*Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		for(int i=0;i<1000000;i++)
		{
			if(IsPalindrome(""+i)&&(IsPalindrome(Integer.toBinaryString(i))))
			{
				System.out.println("" + i + " "+ Integer.toBinaryString(i) );
				sum+=i;
			}
				
			
		}
		System.out.println(sum);
			
	}
	
	static boolean IsPalindrome(String str)
	{
		int stringLength = str.length();
		StringBuilder rev;
		String firstPart, secondPart;
		if(stringLength%2==0)
		{
			firstPart = str.substring(0, stringLength/2);
			secondPart = str.substring(stringLength/2, stringLength);
			
			rev = new StringBuilder(secondPart);
			rev.reverse();
		
			
		}
		
		else
		{
			firstPart = str.substring(0, stringLength/2);
			secondPart = str.substring(stringLength/2+1, stringLength);
			rev = new StringBuilder(secondPart);
			rev.reverse();

		}
		return firstPart.compareTo(new String(rev))==0;
		
	}
	
}
