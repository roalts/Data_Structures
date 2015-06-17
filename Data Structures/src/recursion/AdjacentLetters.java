package recursion;

import java.util.Scanner;

public class AdjacentLetters {

	public static String checkAdjacent(String a) {
		if(0 == a.length()-1)
			return a;
		else if(a.charAt(0) == a.charAt(1)){
			a = a.substring(0,1)+ "*" + a.substring(1);
			return a.substring(0,2) + checkAdjacent(a.substring(2));
		}
		else
			return a.substring(0,1) + checkAdjacent(a.substring(1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String a = s.next();
		s.close();
		System.out.println(checkAdjacent(a));
	}

}
