import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int N;
		Scanner in1 = new Scanner(System.in);
		N = in1.nextInt();
		int pos[] = new int[N];
		String ip[] = new String[N];
		for(int i=0;i<N;i++){
			pos[i]= Integer.parseInt(in1.next());
			ip[i] = new String(in1.next());
		}
		
		for(int i=0;i<N;i++)
			System.out.println((i+1) + " " +gn07a(pos[i],ip[i]));
	}
	
	public static String gn07a(int pos,String ip){
		StringBuilder ip1 = new StringBuilder(ip);
		ip1.deleteCharAt(pos-1);
		return new String(ip1);
	}
	
}

