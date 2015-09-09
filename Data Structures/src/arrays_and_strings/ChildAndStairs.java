package arrays_and_strings;

public class ChildAndStairs {

	public static int countWays(int stairs) {
		if(stairs < 0)
			return 0;
		if(stairs == 0)
			return 1;
		
		return countWays(stairs-3) + countWays(stairs-2) + countWays(stairs-1);
	}
	
	public static int countWaysDP(int stairs, int[] map) {
		if(stairs < 0)
			return 0;
		else if(stairs == 0)
			return 1;
		else if(map[stairs] > 0)
			return map[stairs];
		else{
			map[stairs] = countWaysDP(stairs-3, map) + countWaysDP(stairs-2, map) + countWaysDP(stairs-1, map);
			return map[stairs];
		}
	}
	
	public static void main(String[] args) {
		int map[] = new int[40]; 
		System.out.println(countWaysDP(35, map));
		System.out.println(countWays(35));
		
	}
}

