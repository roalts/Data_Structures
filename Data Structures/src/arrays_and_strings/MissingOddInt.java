package arrays_and_strings;

public class MissingOddInt {
	
	public static int missingOddInt (int[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total = total - array[i];
		}
		return Math.abs(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		System.out.println(missingOddInt(ar));
		
	}

}
