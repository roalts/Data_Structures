package arrays_and_strings;

public class MinimumCostPath {
	public static int minCostSlow(int cost[][], int m, int n)
	{
	   if (n < 0 || m < 0)
	      return Integer.MAX_VALUE;
	   else if (m == 0 && n == 0)
	      return cost[m][n];
	   else
	      return cost[m][n] + Math.min( minCost(cost, m-1, n-1),
	                               Math.min(minCost(cost, m-1, n), 
	                               minCost(cost, m, n-1) ));
	}

	public static int minCost(int[][] input, int m, int n) {
		int[][] t = new int[input.length][input[0].length];
		t[0][0] = input[0][0];
		for(int i = 1; i < input.length; i++) {
			t[i][0] = t[i-1][0] + input[i][0]; 
		}
		for(int i = 1; i < input[0].length; i++) {
			t[0][i] = t[0][i-1] + input[0][i]; 
		}
		for(int i = 1; i < input.length; i++) {
			for(int j = 1; j < input[0].length; j++) {
				t[i][j] = Math.min(t[i-1][j], Math.min(t[i-1][j-1], t[i][j-1])) + input[i][j];
			}
		}
		return t[m][n];
	}
	
	public static void main(String[] args) {
		int input[][] = { {1, 4, 3},
                		  {4, 8, 9},
                		  {1, 5, 3} };
		
		System.out.println(minCost(input, 2,2));
		System.out.println(minCostSlow(input, 2,2));
	}
}
