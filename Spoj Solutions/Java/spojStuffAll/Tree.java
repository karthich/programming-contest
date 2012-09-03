package spojPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;



public class Tree {
	private static int Nodes, Edges;
	
	
	public static void main(String[] args) {
      
		 Scanner sc = new Scanner(System.in);
		 Nodes = sc.nextInt();
		 Edges = sc.nextInt();
		 HashMap<Integer, Vector<Integer>> EdgeMap = new HashMap<Integer, Vector<Integer>>(Nodes);
		 
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
		 
		 System.out.println(HasPath(EdgeMap));
		 
	}
	
	static String HasPath(HashMap<Integer, Vector<Integer>> edgeMap) {
	  
	  Integer currentNode = 1;
	  if(edgeMap.isEmpty())
		  return "YES";
	  
	  Vector<Integer> edges = edgeMap.get(currentNode);
	  Stack<Integer> st = new Stack<Integer>();
	  Boolean explored[] = new Boolean[Nodes];
	  Arrays.fill(explored, false);
	  
	  
	  explored[0] = true;
	  
	  for(Integer node : edges)
	  {
		  st.push(node);
	  }
	  
	  while(!st.isEmpty())
	  {
		  currentNode = st.pop();
		  explored[currentNode-1] = true;
		  if(currentNode == 1)
		  {
			return "NO";
		  } else {
			edges = edgeMap.get(currentNode);
			
		  }
	  }
	  return "Es";
	  
	}
	
	
	
}