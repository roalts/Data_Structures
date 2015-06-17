package recursion;

public class MutliplyTwoNums {

	public static int multiply(int m, int n){
		if(n == 0){
			return 0;
		}
		return m + multiply(m,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiply(3,4));
	}

}
