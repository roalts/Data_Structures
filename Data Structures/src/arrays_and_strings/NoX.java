package arrays_and_strings;

import java.util.Scanner;

public class NoX {

	public static String noX(String input, int beginIndex) {
		String output = "";
		if(beginIndex == input.length())
			return output;
		if(input.charAt(beginIndex) == 'x'){
			return output + noX(input, beginIndex+1);
		}
		else {
			return output + input.charAt(beginIndex) + noX(input, beginIndex+1);
		}
	}
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scanner=new Scanner(System.in);
	        String input = scanner.nextLine();

	        System.out.print(noX(input, 0));

	    }
}
