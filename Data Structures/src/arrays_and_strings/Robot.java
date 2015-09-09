package arrays_and_strings;

public class Robot {

	public static int factorial(int a, int[] map) {
		if(a == 0 || a== 1)
			return 1;
		if(map[a] > 0) 
			return map[a];
		map[a] = a * factorial(a - 1, map);
		return map[a];
	}
	public static int countPaths(int x, int y) {
		int map[] = new int[100];
		int paths = factorial(x+y -2, map)/(factorial(x-1,map)*factorial(y-1,map));
		return paths;
	}
	public static void main(String[] args) {
		System.out.println(countPaths(4,4));
	}
}
