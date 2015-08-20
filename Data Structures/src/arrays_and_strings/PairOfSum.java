package arrays_and_strings;

public class PairOfSum {

	public static void bubbleSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
 	}
	
	public static void pairOfSum(int[] array, int x) {
		bubbleSort(array);
		int i = 0, j = array.length -1;
		while(i <= j) {
			int sum = array[i] + array[j];
			if(sum < x) 
				i++;
			else if (sum > x)
				j--;
			else if(sum == x){
				System.out.println(array[i] +" " + array[j]);
				return;
			}
		}
		System.out.println("NOT FOUND");
		return;
	}
	public static void main(String[] args) {
		int[] array = {1, 4, 45, 6, 10, -8};
		pairOfSum(array, 16);
	}
}
