package spojStuffAll;

//https://www.spoj.pl/problems/SBANK/
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class BankAccounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> bankAccountDb = new TreeMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int numTestCases=Integer.parseInt(sc.nextLine());
		int numberAccounts = 0;
		
		for(int i=0;i<numTestCases;i++)
		{
			
			String tempAcc;
			numberAccounts = Integer.parseInt(sc.nextLine());
			for(int j=0;j<numberAccounts;j++)
			{
				tempAcc = sc.nextLine().trim();
				Integer accountCount = bankAccountDb.get(tempAcc);
				if(accountCount==null)
				{
					bankAccountDb.put(tempAcc , 1);
				}
				else
				{
					bankAccountDb.put(tempAcc, accountCount+1);
				}
				accountCount = null;
			}
			
			for(Map.Entry<String, Integer> entry : bankAccountDb.entrySet())
			{
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			System.out.println();
		   sc.nextLine();
			
			bankAccountDb.clear();
		}
		
		
		
		
		
		
	}

}
