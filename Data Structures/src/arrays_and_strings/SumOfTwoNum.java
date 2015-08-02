package arrays_and_strings;

public class SumOfTwoNum {
	public static void main(String[] args) {
		int a = 5; 
		int b = 4;
		System.out.println(a+" "+b);
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.println(a+" " + b);
	}
}
