package arrays_and_strings;

public class RepresentCents {

	public static int nCents(int n, int[] cache) {
		if(n < 0)
			return 0;
		if(n == 0)
			return 1;
		
		if(cache[n] !=0)
			return cache[n];
		cache[n] = nCents(n-25, cache) + nCents(n-10, cache) + nCents(n-5, cache) + nCents(n-1, cache); 
		return cache[n];
	}
	
	public static void main(String[] args) {
		int cache[] = new int[1000];
		System.out.println(nCents(100, cache));
	}
}
