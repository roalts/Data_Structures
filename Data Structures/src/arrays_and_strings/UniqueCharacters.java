package arrays_and_strings;

import java.util.*;



public class UniqueCharacters {

	public static boolean uniqueCharacters(String input) {
		int[] count = new int[256];
		for(int i = 0; i < input.length(); i++) {
			count[input.charAt(i)]++;
		}
		for(int i = 0; i < input.length(); i++) {
			if(count[input.charAt(i)] > 1)
				return false;
		}
		return true;
		
	}
	
	public static boolean isUnique(String input) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < input.length(); i++) {
			if(set.contains(input.charAt(i)))
				return false;
			else
				set.add(input.charAt(i));
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isUnique(input));
	}

}
