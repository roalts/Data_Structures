package arrays_and_strings;

import java.util.Scanner;

public class CompressedString {

	public static String compressedString(String input) {
		String output = "";
		int count = 1;
		int i = 0;
		for(i = 1; i < input.length(); i++) {
			if(input.charAt(i-1) == input.charAt(i)) {
				count++;
			} else {
				output = output + input.charAt(i-1) + count;
				count = 1;
			}
		}
		output = output + input.charAt(i-1) + count;
		if(output.length() > input.length())
			return input;
		else
			return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(compressedString(input));
	}
}
