package sorting;

public class BubbleSort {

	public static void bubbleSort(int[] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input.length - 1 - i; j++) {
				if(input[j] > input[j+1]) {
					int temp = input[j+1];
					input[j+1] = input[j];
					input[j] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] input = {5,4,3,2,1};
		bubbleSort(input);
		for(int i = 0; i < input.length; i++){
			System.out.println(input[i]);
		}
	}
}
