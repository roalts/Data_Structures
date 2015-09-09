package arrays_and_strings;

public class EditDistance {

	public static int editDistance(String a, String b, int[][]cache) {
		if(a.length() == 0 || b.length() == 0) {
			return Math.abs(a.length() - b.length());
		}
		
		if(cache[a.length()][b.length()] > 0)
			return cache[a.length()][b.length()];
		
		if(a.charAt(0) == b.charAt(0)) {
			return editDistance(a.substring(1), b.substring(1), cache);
		}
		
		cache[a.length()][b.length()] = 1 + Math.min(editDistance(a.substring(1), b.substring(1), cache), 
												Math.min(editDistance(a.substring(1), b, cache), editDistance(a, b.substring(1), cache)));
		
		return cache[a.length()][b.length()];
	}
	
	public static int editDistanceBetter(String a, String b) {
		int cache[][] = new int[a.length()+1][b.length()+1];
		
		for(int i = 0; i < cache.length; i++) {
			cache[i][0] = i;
		}
		for(int i = 0; i < cache[0].length; i++) {
			cache[0][i] = i;
		}
		
		for(int i = 1; i < cache.length; i++) {
			for(int j = 1; j < cache[0].length; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					cache[i][j] = cache[i-1][j-1];
				} else {
					cache[i][j] = 1 + Math.min(cache[i-1][j], Math.min(cache[i][j-1], cache[i-1][j-1]));
				}
			}
		}
		return cache[a.length()][b.length()];
	}
	public static void main(String[] args) {
		String a = "rrrrg";
		String b = "gggg";
		int cache[][] = new int[a.length()+1][b.length()+1];
		System.out.println(editDistanceBetter(a,b));
		System.out.println(editDistance(a,b,cache));
		
	}
}

