package projectEulerStuff;

import java.awt.geom.Point2D;


public class Totient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		float ratio=0,maxTotientRatio=0;
		int maxtotientNum=0;
		for(int j=2;j<10000;j++)
		{
			for(int i=1;i<j;i++)
			{
				if(GCF(i,j)==1)
					sum++;
			}
			
		
			ratio = (float)j/(sum);
			if(ratio>maxTotientRatio)
			{
				maxTotientRatio = ratio;
				maxtotientNum = j;
			}
			
		
			sum=0;
		}
		
		System.out.println(maxtotientNum + " " + maxTotientRatio);
	}
	
	static int GCF(int a, int b) {
			int s;
			
			if (a > b)
			s = b;
			
			else
			s = a;
			
			for (int i = s; i > 0; i--) {
				if ((a%i == 0) && (b%i == 0))
					return i;
			}
			return 1;
	}
	
	

}
