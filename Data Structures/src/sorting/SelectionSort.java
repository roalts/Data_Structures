package sorting;

public class SelectionSort {

public static void selectionSort(int[] input){
		
		for(int i=0; i<input.length; i++){
			for(int j =i+1; j<input.length; j++){
				if(input[i]>input[j]){
					int temp = input[j];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = {5,4,3,2,1};
		selectionSort(input);
		for(int i = 0; i < input.length; i++){
			System.out.println(input[i]);
		}
	}
}
