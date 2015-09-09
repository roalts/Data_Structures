package arrays_and_strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostSquareArea {

	public static int maxArea(int[][] input) {
		int max = Integer.MIN_VALUE;
		int k = 0,l = 0;
		for(int i = 1; i < input.length; i++) {
			for(int j = 1; j < input[0].length; j++) {
				if(input[i][j] == 1) {
					if(input[i - 1][j] >= 1 && input[i][j-1] >= 1 && input[i-1][j-1] >=1) {
						input[i][j] = Math.min(input[i - 1][j], Math.min(input[i - 1][j-1],input[i][j-1])) + 1;
						if(max < input[i][j]) {
							max = input[i][j];
							k = i;
							l = j;
						}
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] input = {{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
		//System.out.println(maxArea(input));
		Scanner s = new Scanner(System.in);
		String in = s.next();
		char[] inp = in.toCharArray();
		Arrays.sort(inp);
		in = new String(inp);
		System.out.print(in);
		
	}

}
