package recursion;

public class NumericString {

	public static char[] codes(){
		char[] code = new char[26];
		char A = 'a';
		for(int i = 0; i < 26; i++){
			code[i] = A++;
		}
		return code;
	}
	
//	public static String[] printNumericString(String input) {
//		if(input.length() == 0){
//			String[] output = new String[1];
//			output[0] = "";
//			return output;
//		}
//		
//			
//		
//		
//	}
	
	public static void main(String[] args){
		char[] code = codes();
		System.out.println(code[0]);
	}
}
