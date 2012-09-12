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
	private static HashMap<Integer, Vector<Integer>> EdgeMap;
	public static void main(String[] args) {
      
		 Scanner sc = new Scanner(System.in);
		 Nodes = sc.nextInt();
		 Edges = sc.nextInt();
		 EdgeMap = new HashMap<Integer, Vector<Integer>>(Nodes);
		 
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
		 System.out.println(isTree(EdgeMap));
		 
	}
	
	static String isTree(HashMap<Integer, Vector<Integer>> edgeMap) {
	  
	   
	  if(edgeMap.isEmpty()) {
		  return "YES";
	  }
	  
	  int level = 0;
	  int nodeLevel[] = new int[Nodes];
	  
	  int vertexColor[] = new int[Nodes];
	  Arrays.fill(vertexColor,0);
	  Queue<Integer> q = new LinkedList<Integer>();
	  
	  for (int u=1; u <= Nodes; u++) {
	    if(vertexColor[u-1] == 0) {
	    	vertexColor[u-1] = 1;
	  
	    	nodeLevel[u-1] = 1;
	    	q.offer(u);
	    	
	    	while(!q.isEmpty()) {
	    	    //u = st.pop();
	    		u = q.poll();
	    		
	    	    Vector<Integer> neighbors = edgeMap.get(u);
		    	System.out.println(u + " -> " + nodeLevel[u-1]);
	    		for(Integer v : neighbors) {
	    			if(vertexColor[v-1] == 0)
	    			{
	    				vertexColor[v-1] = 1;
	    				nodeLevel[v-1] = nodeLevel[u-1] + 1;
	    				
	    				q.offer(v);
         			} else if((vertexColor[v-1] != 0)  && nodeLevel[v-1] == nodeLevel[u-1]) {
	    				return "NO";
	    			}
	    			
	    		}
	    		vertexColor[u-1] = 2;
	    	}
	    }
	  }
	  return "YES";
	  
	}
}