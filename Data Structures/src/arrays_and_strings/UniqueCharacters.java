package arrays_and_strings;

import java.util.HashMap;
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
	
	public static boolean isUniqueChar(String input) {
		int count[] = new int[256];
		for(int i = 0; i < input.length(); i++) {
			count[input.charAt(i)]++; 
		}
		for(int i = 0; i < input.length(); i++) {
			if(count[input.charAt(i)] != 1)
				return false;
		}
		return true;
	}
	
	public static boolean isUniqueHashMap(String input) {
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		for(int i = 0; i < input.length(); i++) {
			if(map.containsValue(input.charAt(i))) {
				map.put(key, value)
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isUniqueChar(input));
	}

}
