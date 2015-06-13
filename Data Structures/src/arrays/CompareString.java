package arrays;

import java.util.Scanner;

public class CompareString {

	public static boolean checkReverse(String a, String b) {
		if(a.length()!=b.length())
			return false;
		else if(a.length() == 0)
			return true;
		else if (a.charAt(0) == b.charAt(b.length()-1))
			return checkReverse(a.substring(1), b.substring(0,b.length()-1));
		else 
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String a = s.next();
		String b = s.next();
		System.out.println(checkReverse(a,b));
		s.close();
		
	}

}
