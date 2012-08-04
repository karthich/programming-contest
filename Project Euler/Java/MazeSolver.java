package projectEulerStuff;

public class MazeSolver {

	static int[][] Maze;
	static boolean[][] BooleanMaze;
	static int MAX_SIZE = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze  = new int[MAX_SIZE][MAX_SIZE];
		BooleanMaze = new boolean[MAX_SIZE+1][MAX_SIZE+1];
		int xpos = 0,ypos=0;
		
		solveMaze(0,0);

	}
	static void solveMaze(int currentxPos,int currentyPos)
	{
		
	}
}
