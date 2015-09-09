package arrays_and_strings;

public class Fibonacci {

	public int easyFibonacci(int i) {
		if(i == 0)
			return 0;
		if(i == 1)
			return 1;
		return easyFibonacci(i-1) + easyFibonacci(i-2);
	}
	int[] fib = new int[100];
	public int fastFibonacci(int i) {
		if(i == 0)
			return 0;
		if(i == 1)
			return 1;
		if(fib[i] != 0)
			return fib[i];
		fib[i] = fastFibonacci(i-1) + fastFibonacci(i-2); 
		return fib[i];
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fastFibonacci(45));
		System.out.println(f.easyFibonacci(45));
	}
	
}
