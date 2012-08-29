package spojPrograms;

import java.util.Scanner;


public class JavaCpp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			String line;
			
			while(scan.hasNextLine()){
				line = scan.nextLine();
				System.out.println(splitCamelCase(line));
				if(javaIdentifier(line))
				{
						
				}
				
				else if(cppIdentifier(line))
				{
					convertToJava(line);
				}
				else
				{
					System.out.println("Error!");
				}
				
			}
	}
	
	public static Boolean javaIdentifier(String line)
	{
		for(int i=1;i<line.length();i++)
		{
			
		}
		return false;
	}
	
	static String splitCamelCase(String s) {
		   return s.replaceAll(
		      String.format("%s|%s|%s",
		         "(?<=[A-Z])(?=[A-Z][a-z])",
		         "(?<=[^A-Z])(?=[A-Z])",
		         "(?<=[A-Za-z])(?=[^A-Za-z])"
		      ),
		      " "
		   );
	}
	
	public static Boolean cppIdentifier(String line)
	{
		Boolean isCpp = false;
		
		String splitArray[] = line.split("_");
		
		
		if(splitArray.length>1)
		{
			for(int i=1;i<splitArray.length;i++)
			{
				if(Character.isUpperCase(splitArray[i].charAt(0)))
				{
					return false;
				}
				else
					continue;
			}
			return true;
		}
		else
			return isCpp;
		
	}

	static String convertToJava(String line)
	{
		String lineArr[] = line.split("_");
				
		StringBuilder sbuild;
		return "blah";
	//	for(String l : line)
	}
}
