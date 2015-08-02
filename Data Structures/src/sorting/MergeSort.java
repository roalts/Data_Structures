package sorting;

public class MergeSort {

	public static void mergeSort(int beginIndex, int endIndex, int[] input) {
		if(beginIndex >= endIndex)
			return;
		int mid = (beginIndex + endIndex)/2;
		mergeSort(beginIndex, mid, input);
		mergeSort(mid+1, endIndex, input);
		merge(beginIndex, mid, endIndex, input);
	}
	
	public static void merge(int beginIndex, int mid, int endIndex, int[] input) {
		
		int[] output = new int[endIndex - beginIndex +1];
		int k =0; int i = beginIndex; int j = mid+1;
		while(i <= mid && j <= endIndex) {
			if(input[i] < input[j]) {
				output[k++] = input[i];
				i++;
			} else {
				output[k++] = input[j];
				j++;
			}
		}
		
		while(j <= endIndex) {
			output[k++] = input[j++];
		}
		
		while(i <= mid) {
			output[k++] = input[i++];
		}
		
		for(i = 0; i < output.length; i++) {
			input[beginIndex++] = output[i];
		}
	}
	
	public static void main(String[] args) {
		int[] input = {10,9,8,7,6,5,4,3,2,1};
		mergeSort(0, input.length-1, input);

		for(int i = 0; i <input.length; i++) {
			System.out.println(input[i]);
		}
	}
}
