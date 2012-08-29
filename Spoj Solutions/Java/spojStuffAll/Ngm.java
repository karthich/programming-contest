package spojPrograms;

import java.util.Scanner;

// http://www.spoj.pl/problems/NGM/
public class Ngm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long input;
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLong();
		
		int maxDigit=0;
		long finalAnswer = input;
		Boolean player = false;
		
		long tempNum = input;
		int count=0;
		while(tempNum!=0)
		{
			
			
				
			maxDigit = findMaximumDigit(tempNum);
			System.out.println("Step: " + tempNum);
			tempNum -=maxDigit;
			
			player = !(player);
			count++;
		}
		System.out.println("Step: " + tempNum);
		if(player)
		{
			System.out.println("1");
			System.out.println(count+1);
		}
		
		else
		{
			System.out.println("2");
		}
	}
	
	static int findMaximumDigit(long in)
	{
		int max = 0;
		long temp = in;
		int digit;
		while(temp!=0)
		{
			digit = (int)temp%10;
			temp /=10;
			
			if(digit>max)
			{
				max = digit;
			} else {
				continue;
			}
			
		}
		return max;
	}

}
