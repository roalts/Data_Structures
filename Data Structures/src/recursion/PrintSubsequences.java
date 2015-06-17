package recursion;

public class PrintSubsequences {

	public static void printSubsequences(String input, String output){
		if(input.length() == 0){
			System.out.println(output);
			return;
		}
		printSubsequences(input.substring(1), output+input.charAt(0));
		printSubsequences(input.substring(1), output);
		
		return;
	}
	public static String[] printSubsequences(String input){
		if(input.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOutput = printSubsequences(input.substring(1));
		String[] output = new String[2*smallOutput.length];
		int i = 0, j = 0;
		while(i < output.length) {
			output[i++] = input.charAt(0) + smallOutput[j];
			output[i++] = smallOutput[j++];
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		String[] output = printSubsequences(s);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		
	}

}
