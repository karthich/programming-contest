package projectEulerStuff;
import java.util.Hashtable;

public class StartNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startNum = 1000000;
		Hashtable<Long, Long> myMap = new Hashtable<Long,Long>();
		long count = 0,maxCount = 0;
		Long currentNum;
		long maxCountNum=0;
		for(long i=2;i<=startNum;i++)
		{
			currentNum = i;
			count = 0; 
			
			Long numCount = null;
				
			while(currentNum!=1)
			{
				numCount = myMap.get(currentNum);
				if(numCount!=null)
				{
					count+= numCount;
					//System.out
						//	.println("Got " + currentNum + " from table");
					break;
				}
				else if(currentNum%2==0)
					currentNum /=2;
				else
					currentNum = 3*currentNum + 1;
				
				count++;
			}
			
			//System.out.println("Current Number = " +i + " Count= "+count);
			myMap.put(i,count);
			
			if(count>maxCount)
			{
				maxCount = count;
				maxCountNum = i;
				//System.out.println("maxCountNum= " + maxCountNum
					//	+ " maxCount= " + maxCount);
			}
		}
		System.out.println(maxCountNum+" "+maxCount);
		

	}

}
