package spojStuffAll;

import java.math.BigInteger;
import java.util.Scanner;

public class Bishops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n;
		Scanner scan = new Scanner(System.in);
		String line = null;
		while (scan.hasNextLine()) {
		   line = scan.nextLine();
		   n = new BigInteger(line);
		   System.out.println(countBishops(n));
		}

	}
	
	static BigInteger countBishops(BigInteger num)
	{
		if(num.equals(new BigInteger("1")))
			return new BigInteger("1");
		else
			return num.multiply(new BigInteger("2")).subtract(new BigInteger("2")); 
	}

}
