/*You are given an unweighted, undirected graph. Write a program to check if it's a tree topology.

Input

The first line of the input file contains two integers N and M --- number of nodes and number of edges in the graph (0 < N <= 10000, 0 <= M <= 20000). Next M lines contain M edges of that graph --- Each line contains a pair (u, v) means there is an edge between node u and node v (1 <= u,v <= N).

Output

Print YES if the given graph is a tree, otherwise print NO.

Example

Input:
3 2
1 2
2 3

Output:
YES*/
#include<iostream>
#include<stdio.h>
#include<stack>
#include<vector>

#define NUM_NODES 10001

using namespace std;
vector<int> edgeMap[NUM_NODES];
int edges =0 ;
void tree(int n) {
  if(edges == 0){
    printf("YES\n");
    return;
  }
  int pred[NUM_NODES] = {0};
  int state[NUM_NODES] = {0};
  pred[1] = -1;
  stack<int> st;
  
       st.push(1);
       state[1] = 1;       
       while(!st.empty()) {
	int current = st.top();
	st.pop();
	state[current] = 1;
	
	vector<int> neighbors = edgeMap[current];
        for(int j=0;j<neighbors.size();j++) {
	  if(state[neighbors.at(j)]==0) {
	    pred[neighbors.at(j)] = current;
	    state[neighbors.at(j)] = 1;
	    st.push(neighbors.at(j));
	  } else if(state[neighbors.at(j)] == 2 && pred[current] != neighbors.at(j) ) {
	    printf("NO\n");
	    return;
	  }
	}
	state[current] = 2;
       }
  for(int i=1;i<=n;i++) {
    if(state[i]==0) {
      printf("NO\n");
      return;
    }
  }   
  printf("YES\n");
  return;
}

int main() {
  int nodes;
  scanf("%d %d",&nodes,&edges);
  int u,v;
  while(edges--) {
    scanf("%d %d",&u,&v);
    edgeMap[u].push_back(v);
    edgeMap[v].push_back(u);
  }

  tree(nodes);
}
