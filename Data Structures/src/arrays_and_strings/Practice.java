package arrays_and_strings;

public class Practice {

	public static String avoidDuplicates(String input) {
		String output = new String();
		for(int i = 0; i<input.length(); i++) {
			if(i != input.length()-1){
				if(input.charAt(i) == input.charAt(i+1)){
					output = output + input.charAt(i);
					i++;
				} else {
					output = output + input.charAt(i);				
				}
			} else {
				output = output + input.charAt(i);
			}

		}
		return output;
	}
	public static void main(String[] args) {
		String input = "aabbccedf";
		System.out.println(avoidDuplicates(input));
	}
}
