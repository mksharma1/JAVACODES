
public class RatMaze {

	private static boolean ratInMaze(int[][] maze) {
		// TODO Auto-generated method stub

		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze, 0, 0, path);
	}

	public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
		boolean res = false;
		// check if i and j falls in valid cell
		int n = maze.length;
		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}

		path[i][j] = 1;
		if (i == n - 1 || j == n - 1) { // checking dest
			// path[i][j]=1;
			return true;
		}
		if(solveMaze(maze,i-1,j,path)) {
			return true;
		}
		if(solveMaze(maze,i,j+1,path)) {
			return true;
		}
		if(solveMaze(maze,i+1,j,path)) {
			return true;
		}
		if(solveMaze(maze,i,j-1,path)) {
			return true;
		}
		path[i][j] = 1;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 1, 1 } };
		boolean pathpossible = ratInMaze(maze);
		System.out.println(pathpossible);

	}

}
