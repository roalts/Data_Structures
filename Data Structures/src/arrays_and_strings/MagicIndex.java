package arrays_and_strings;

public class MagicIndex {

	public static int magicIndexSlow(int[] input) { 
		for(int i = 0; i < input.length; i++) {
			if(input[i] == i)
				return i;
		}
		return -1;
	}
	public static int magicIndexFast(int[] input, int beg, int end) {
		if(beg > end || end >= input.length)
			return -1;
		int mid = (beg + end)/2;
		if(input[mid] == mid)
			return mid;
		else if (input[mid] < mid)
			return magicIndexFast(input, mid+1, end);
		else
			return magicIndexFast(input, beg, mid-1);
	}
	public static void main(String[] args) {
		int[] input = {-40,-20,-1,1,2,3,5,7,9,12,13};
		System.out.println(magicIndexSlow(input));
	}
}
