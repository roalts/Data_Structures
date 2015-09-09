package arrays_and_strings;

public class RobotInMaze {

	public static boolean isOffLimit(int x, int y, int[][] input, int[][] cache) {
		if(x < 0 || x >= input.length || y < 0 || y >= input[0].length || input[x][y] == 0)
			return true;
		return false;
	}

	public static boolean isPath(int[][] input, int x, int y, int[][] cache) {
		if(x == 0 && y == 0) {
			
			return true;
		}
		if((!isOffLimit(x,y,input, cache)) && cache[x][y] == 0) {
			cache[x][y] = 1;
			if(isPath(input, x-1, y, cache)) {
				return true;
			}
				

			if(isPath(input, x, y-1, cache)) {
				return true;
			}
			
			if(isPath(input, x, y+1, cache)) {
				return true;
			}
			
			if(cache[x+1][y] == 0 && isPath(input, x+1, y, cache)) {
				return true;
			}
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] input =  {{1, 0, 1, 1, 1},
						  {1, 0, 1, 0, 1},
						  {1, 0, 1, 0, 1},
						  {1, 1, 1, 0, 1}};
		int[][] cache = new int[5][5];
		System.out.println(isPath(input,2,4,cache));
	}

}
