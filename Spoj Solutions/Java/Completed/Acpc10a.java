package spojStuffAll;

import java.util.Scanner;

public class Acpc10a {

	/**
	 * http://www.spoj.pl/problems/ACPC10A/
	 */
	public static void main(String[] args) {
		
		int inputArr[] = new int[3];
		Scanner in1 = new Scanner(System.in);
		

		inputArr[0] = in1.nextInt();
		inputArr[1] = in1.nextInt();
		inputArr[2] = in1.nextInt();
		
		do
		{
			apgp(inputArr);
			inputArr[0] = in1.nextInt();
			inputArr[1] = in1.nextInt();
			inputArr[2] = in1.nextInt();
		}while(!(inputArr[0]==0&&inputArr[1]==0&&inputArr[2]==0));

	}
	
	static void apgp(int[] inputArr)
	{
		int sum = inputArr[0] + inputArr[1] + inputArr[2];
		double product =inputArr[0] * inputArr[1] * inputArr[2];
		
		if((float)sum/3==(float)inputArr[1])
		{
			System.out.println("AP "
					+ (2 * (inputArr[2] - inputArr[1]) + inputArr[1]));
			return;
			
		}
		else
		{
			float r = inputArr[2] /inputArr[1];
			System.out.println("GP " + ((int)(r * r * inputArr[1])));;
			return;
		}
	}
}


