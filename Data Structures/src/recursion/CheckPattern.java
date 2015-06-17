package recursion;

public class CheckPattern {
	
	public static boolean checkString(String input, int position){
		if(position >= input.length())
			return true;
		else if(input.charAt(0) != 'a')
			return false;
		else if((input.charAt(position) == 'a') && ((position == input.length()-1)||(input.charAt(position+1)=='b')||(input.charAt(position+1)== 'a')))
			return checkString(input, position+1);
		else if((input.substring(position, position+2).equals("bb"))&&((position >= input.length()-2) || (input.charAt(position+2)=='a')))
			return checkString(input, position + 2);
		
		
		return false;
	}

	public static void main(String[] args){
		String input = "aaabbbaa";
		System.out.println(checkString(input, 0));
	}
}
