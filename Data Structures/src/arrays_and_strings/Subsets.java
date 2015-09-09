package arrays_and_strings;

import java.util.ArrayList;

public class Subsets {

	public static ArrayList<ArrayList<Integer>> subsetOfArray(int[] input, int index) {
		
		if(index < 0) {
			ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();	
			output.add(new ArrayList<Integer>());
			return output;
		}

		ArrayList<ArrayList<Integer>> smallOutput = subsetOfArray(input, index-1);
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < smallOutput.size(); i++) {
			ArrayList<Integer> o = new ArrayList<Integer>();
			for(int j = 0; j < smallOutput.get(i).size(); j++) {
				int a = smallOutput.get(i).get(j);
				o.add(a);
			}
			output.add(o);
		}
		for(int i = 0; i < smallOutput.size(); i++) {
			output.add(smallOutput.get(i));
			output.get(i).add(input[index]);

		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = {1,2,3};
		ArrayList<ArrayList<Integer>> smallOutput = subsetOfArray(input, input.length-1);
		for(int i = 0; i < smallOutput.size(); i++) {
			for(int j = 0; j < smallOutput.get(i).size(); j++){
				System.out.print(smallOutput.get(i).get(j) + "\t");
			}
			System.out.println();
		}
	}
}
