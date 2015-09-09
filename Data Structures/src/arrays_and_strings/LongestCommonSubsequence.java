package arrays_and_strings;

public class LongestCommonSubsequence {

	public static int lcs(String a, String b, int m, int n) {
		if(m < 1 || n < 1)
			return 0;
		if(a.charAt(m-1) == b.charAt(n-1))
			return 1 + lcs(a,b,m-1,n-1);
		else
			return Math.max(lcs(a,b,m-1,n), lcs(a,b,m,n-1));
	}

	public static void main(String[] args) {
		String a = "AGGTAB";
		String b = "GXTXAYB";
		System.out.println(lcsDP(a,b));
	}

	public static String lcsDP(String a, String b) {
		int sol[][] = new int[a.length()+1][b.length()+1];
		for(int i = 1; i < sol.length; i++) {
			for(int j = 1; j < sol[0].length; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					sol[i][j] = sol[i-1][j-1] + 1;
				}
				else
					sol[i][j] = Math.max(sol[i-1][j], sol[i][j-1]);
			}
		}
		int i = a.length();
		int j = b.length();
		String answer = "";
		while(i >= 1 && j >= 1) {
			if(sol[i-1][j] != sol[i][j]){
				if (sol[i][j-1] != sol[i][j]) {
					answer = answer + a.charAt(i-1);
					i--;
					j--;
				} else 
					j--;
			} else
				i--;
		}
		return answer;
	}

}