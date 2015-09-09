package arrays_and_strings;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxHistogramArea {

	public static int maxArea(int[] input) {
		int max = 0;
		int i;
		int area = 0;
		Deque<Integer> stack = new LinkedList<Integer>();
		for(i = 0; i < input.length; i++) {
			if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
				stack.offerFirst(i);
			} else {
				while(!stack.isEmpty() || input[stack.peekFirst()] > input[i] ){
					int top = stack.pollFirst();
					if(stack.isEmpty()) {
						area = input[top] * i;
					} else {
						area = input[top] * (i - stack.peek() - 1);
					}
					if(area > max)
						max = area;
				}
			}
		}
		while(!stack.isEmpty()) {
			int top = stack.pollFirst();
			if(stack.isEmpty()){
				area = input[top] * i;
			} else {
				area = input[top] * (i - stack.peekFirst() - 1);
			}
			if(area > max)
				max = area;
		}
		return max;
	}
//	public static int maxArea(int input[]){
//        Deque<Integer> stack = new LinkedList<Integer>();
//        int maxArea = 0;
//        int area = 0;
//        int i;
//        for(i=0; i < input.length;){
//            if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
//                stack.offerFirst(i++);
//            }else{
//                int top = stack.pollFirst();
//                //if stack is empty means everything till i has to be
//                //greater or equal to input[top] so get area by
//                //input[top] * i;
//                if(stack.isEmpty()){
//                    area = input[top] * i;
//                }
//                //if stack is not empty then everythin from i-1 to input.peek() + 1
//                //has to be greater or equal to input[top]
//                //so area = input[top]*(i - stack.peek() - 1);
//                else{
//                    area = input[top] * (i - stack.peekFirst() - 1);
//                }
//                if(area > maxArea){
//                    maxArea = area;
//                }
//            }
//        }
//        while(!stack.isEmpty()){
//            int top = stack.pollFirst();
//            //if stack is empty means everything till i has to be
//            //greater or equal to input[top] so get area by
//            //input[top] * i;
//            if(stack.isEmpty()){
//                area = input[top] * i;
//            }
//            //if stack is not empty then everything from i-1 to input.peek() + 1
//            //has to be greater or equal to input[top]
//            //so area = input[top]*(i - stack.peek() - 1);
//            else{
//                area = input[top] * (i - stack.peekFirst() - 1);
//            }
//        if(area > maxArea){
//                maxArea = area;
//            }
//        }
//        return maxArea;
//    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		System.out.print(maxArea(input));
	}
}
