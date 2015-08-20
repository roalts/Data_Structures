package arrays_and_strings;

public class MissingInteger {

	public static int missingInt(int array[]) {
		int n = array.length;
		int total = (n+1) * (n+2)/2;
		for(int i = 0; i < array.length; i++) {
			total = total - array[i];
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,8,7,10,4,5,6};
		System.out.println(missingInt(array));
	}

}
