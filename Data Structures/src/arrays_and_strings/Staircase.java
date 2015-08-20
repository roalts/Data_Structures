package arrays_and_strings;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int height = s.nextInt();
        int i  = height;
        int k = height;
        while(i > 0) {
            int j = i - 1;
            while(j > 0){
                System.out.print(" ");
                j--;
            }
            j = height - i + 1;
            while(j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }
    }
	
}
