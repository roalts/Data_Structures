package arrays_and_strings;

import java.util.Scanner;

public class CheckPermutation {

	public static boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) 
			return false;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		java.util.Arrays.sort(c1);
		java.util.Arrays.sort(c2);
		int i = 0;
		while(i < c1.length) {
			if(c1[i] != c2[i])
				return false;
			i++;
		}
		return true;
	}
	public static boolean isPermutation2(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int count[] = new int[256];
		for(int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}
		for(int i = 0; i < s1.length(); i++) {
			if(--count[s2.charAt(i)] < 0)
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(isPermutation2(s.next(), s.next()));
	}
}
