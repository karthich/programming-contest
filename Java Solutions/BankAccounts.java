package SpojStuff;

import java.util.PriorityQueue;

public class BankAccounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("03 10103538 2222 1233 6160 0142");
		String b = new String("03 10103538 2222 1233 6160 0141");
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add(a);
		pq.add(b);
		pq.add("30 10103538 2222 1233 6160 0142");
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
