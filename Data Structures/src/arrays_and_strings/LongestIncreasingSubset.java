package arrays_and_strings;

public class LongestIncreasingSubset {

	public static int lis(int[] input) {
		int max = 0;
		int temp[] = new int[input.length];
		for(int i = 0; i < input.length; i++) {
			temp[i] = 1;
		}
		for(int i = 1; i < input.length; i++) {
			for(int j = 0; j < i; j++) {
				if(input[j] < input[i]) {
					temp[i] = Math.max(temp[i], temp[j]+1);
				}
			}
		}
		for(int i = 0; i < input.length; i++) {
			if(temp[i] > max)
				max = temp[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 44, 50, 41, 60 };
		System.out.println(lis(arr));
	}
}
