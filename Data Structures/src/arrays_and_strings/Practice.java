package arrays_and_strings;

import java.util.Scanner;

public class Practice {

	public static String avoidDuplicates(String input) {
		String output = new String();
		for(int i = 0; i<input.length(); i++) {
			if(i != input.length()-1){
				if(input.charAt(i) == input.charAt(i+1)){
					output = output + input.charAt(i);
					i++;
				} else {
					output = output + input.charAt(i);				
				}
			} else {
				output = output + input.charAt(i);
			}

		}
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		String input = s.next();
		String output="";
		int k = s.nextInt();
		int i = 0;
		char c = 0;
		while(i < input.length()) {
			if (input.charAt(i) >= 97 && input.charAt(i) <= 122 ) {
				c = (char) (input.charAt(i) + k);
				while(c > 122) {
					c = (char) (c - 122 + 97 - 1);
				}
				output = output + c;
				
			}
			else if(input.charAt(i) >= 65 && input.charAt(i) <= 90) {
				c = (char) (input.charAt(i) + k);
				while(c > 90) {
					c = (char) (c - 90 + 65 - 1);
				}
				
				output = output + c;
			}
			else 
				output = output + input.charAt(i);
			i++;
		}
		System.out.println(output);
	}
}

