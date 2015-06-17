package recursion;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String s, int first, int last){
		if(first >= last)
			return true;
		else {
			if(s.charAt(first) == s.charAt(last))
				return true;
			else 
				return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String = ");
		String f=s.next();
		s.close();
		System.out.println(checkPalindrome(f, 0, f.length()-1 ));
	
	}

}
