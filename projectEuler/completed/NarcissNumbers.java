package projectEulerPrograms;

public class NarcissNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum = 0;
		long mainSum = 0;
		
		System.out.println(sum);
		for(long i=2; i < 10000000; i++) {
			long num = i;
			while(num > 0 ) {
			  sum += Math.pow((num % 10),5);
			  num = num/10;
			}
			
			if(sum == i) {
			  System.out.println(i);
			  mainSum += i;
			}
			sum = 0;
			
		}
		System.out.println(mainSum);

	}

}
