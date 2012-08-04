package spojStuffAll;

public class Acode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "11111";
		
		acode(input);

	}
	
	public static void acode(String ip)
	{
		
		int mTable[] = new int [ip.length()];
		
		for(int i=0;i<ip.length();i++)
		{
			if(ip.charAt(i)=='1'||ip.charAt(i)=='2')
			{
				try
				{
					mTable[i] += mTable[i-1];
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					mTable[i] = 0;
				}
				
			}
			else
			{
				
			}
			
		}
	}
}

