package arrays_and_strings;

public class SwapValues {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println("Old a = " + a);
		System.out.println("Old b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("New a = " + a);
		System.out.println("New b = " + b);
	}
}
