package spojStuffAll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;



public class Tree {
	private static int Nodes, Edges;
	private static boolean explored[];
	private static HashMap<Integer, Vector<Integer>> EdgeMap;
	public static void main(String[] args) {
      
		 Scanner sc = new Scanner(System.in);
		 Nodes = sc.nextInt();
		 Edges = sc.nextInt();
		 EdgeMap = new HashMap<Integer, Vector<Integer>>(Nodes);
		 explored = new boolean[Nodes];
		 Arrays.fill(explored, false);
		 
		 int n1, n2;
		 for(int i=0; i< Edges; i++){
			 
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			 Vector<Integer> temp;
			 
			 if (EdgeMap.containsKey(n1)) {
			   temp = EdgeMap.get(n1);
			 } else {
			   temp = new Vector<Integer>();
			 }
			 
			 temp.add(n2);
			 EdgeMap.put(n1, temp);
			 
			 if(EdgeMap.containsKey(n2)) {
			   temp = EdgeMap.get(n2);
			 } else {
			   temp = new Vector<Integer>();
			 }
			 temp.add(n1);
			 EdgeMap.put(n2, temp);
     	 }
		 
		 
	}
	
	static String HasPath(int start, int end, HashMap<Integer, Vector<Integer>> edgeMap) {
	  
	  
	  if(edgeMap.isEmpty()) {
		  return "YES";
	  }
	  
	  Stack<Integer> st = new Stack<Integer>();
	  Boolean explored[] = new Boolean[Nodes];
	  Arrays.fill(explored, false);
	  
	  int currentNode = start;
	  explored[0] = true;
	  Vector<Integer> edges = edgeMap.get(start);
	  
	  
	  for(Integer node : edges)
	  {
		  st.push(node);
	  }
	  int prevNode = start;
	  while(!st.isEmpty())
	  {
		  currentNode = st.pop();
		  
		  
	  }
	  return "Es";
	  
	}
	
	
	
	
	 
	
	
}