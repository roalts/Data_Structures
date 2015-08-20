package arrays_and_strings;

import java.util.Scanner;

public class Cavity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		char[][] map = new char[size][];
		int i = 0; 
		while(i < size) {
			map[i] = s.next().toCharArray();
		}
		for(i = 1; i < size - 1; i++) {
			for(int j = 1; j < size - 1; j++) {
				if((map[i][j] < map[i][j+1])
					&& (map[i][j] < map[i][j-1])
					&& (map[i][j] < map[i+1][j])
					&& (map[i][j] < map[i-1][j])){
					map[i][j] = 'X';
				}       
			}
		}
		for(i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}

