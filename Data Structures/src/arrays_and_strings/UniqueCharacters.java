package arrays_and_strings;

import java.util.HashSet;
import java.util.Scanner;


public class UniqueCharacters {


	public static boolean uniqueCharAlgo(String s) {
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(i != j) {
					if(s.charAt(i) == s.charAt(j)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isUniqueChar(String s) {
		HashSet<Character> hashSet = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			if(hashSet.contains(s.charAt(i)))
				return false;
			else 
				hashSet.add(s.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isUniqueChar(input));
	}

}
