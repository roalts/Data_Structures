package arrays_and_strings;

public class ChangeToZero {

	public static int[][] modifyMatrix(int[][] input) {
		boolean row[] = new boolean[input[0].length];
		boolean column[] = new boolean[input.length];
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[0].length; j++) {
				if(input[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i = 0; i < row.length; i++) {
			if(row[i])
				nullifyRow(input, i);
		}
		for(int i = 0; i < row.length; i++) {
			if(column[i])
				nullifyColumn(input, i);
		}
		return input;
	}

	public static void nullifyRow(int[][] input, int pos) {
		for(int i = 0; i < input[0].length; i++) {
			input[pos][i] = 0;
		}
	}
	public static void nullifyColumn(int[][] input, int pos) {
		for(int i = 0; i < input.length; i++) {
			input[i][pos] = 0;
		}
	}
	
	public static int[][] modify(int[][] input) {
		boolean rowHasZero = false, columnHasZero = false;
		for(int i = 0; i < input.length; i++) {
			if(input[i][0] == 0)
				columnHasZero = true;
		}
		for(int i = 0; i < input[0].length; i++) {
			if(input[0][i] == 0)
				rowHasZero = true;
		}
		
		for(int i = 1; i < input.length; i++) {
			for(int j = 1; j < input[0].length; j++) {
				if(input[i][j] == 0) {
					input[i][0] = 0;
					input[0][j] = 0;
				}
			}
		}
		for(int i = 0; i < input.length; i++) {
			if(input[i][0] == 0)
				nullifyRow(input, i);
		}
		for(int i = 0; i < input[0].length; i++) {
			if(input[0][i] == 0)
				nullifyColumn(input, i);
		}
		if(rowHasZero)
			nullifyRow(input, 0);
		
		if(columnHasZero)
			nullifyColumn(input, 0);
		return input;
	}
	public static void main(String args[]) {
		int[][] input = {{1,0,1}, {1,1,1},{2,2,7}};
		input = modify(input);
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[0].length;j++) {
				System.out.print(input[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
