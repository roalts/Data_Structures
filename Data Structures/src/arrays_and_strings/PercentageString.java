package arrays_and_strings;

import java.util.Scanner;

public class PercentageString {

	public static String editString(String input) {
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i)==' '){
				input = input.substring(0,i) + "%20" + input.substring(i+1,input.length());
			}
		}
		return input;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(editString(s.nextLine()));
	}
}
