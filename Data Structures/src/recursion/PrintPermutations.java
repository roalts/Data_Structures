package recursion;

public class PrintPermutations {

	public static String[] printPermutations(String s){
		if(s.length() == 1){
			String[] output = new String[1];
			output[0] = s.charAt(0)+"";
			return output;
		}
		String[] smallerOutput = printPermutations(s.substring(1));
		String[] output = new String[(smallerOutput.length + 1) * smallerOutput.length];
		int k = 0;
		for(int i = 0; i < smallerOutput.length; i++){
			for(int j = 0; j < smallerOutput[0].length() + 1; j++){
				output[k++] = smallerOutput[i].substring(0,j) + s.charAt(0) + smallerOutput[i].substring(j);
			}
		}
			
		return output;
	}
	public static void printPermutations(String input, String output){
		if(input.length() == 0){
			System.out.println(output);
			return;
		}
		for(int i = 0; i < output.length()+1; i++){
			printPermutations(input.substring(1), output.substring(0,i)+input.charAt(0)+output.substring(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		//String[] output = printPermutations(s);
		printPermutations(s,"");
		//for(int i = 0; i < output.length; i++) {
			//System.out.println(output[i]);
	//	}
	}

}
