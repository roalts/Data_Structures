package stacks_and_queues;

import java.util.Scanner;

public class SortStack {	

	public static StackUsingLL<Integer> sortStack(StackUsingLL<Integer> stack1) throws StackEmptyException {
		StackUsingLL<Integer> stack2 = new StackUsingLL<Integer>();
		while(!stack1.isEmpty()) {
			int temp = stack1.pop();
			while(!stack2.isEmpty() && stack2.top() > temp) {
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
		return stack2;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		while(input != -1) {
			stack.push(input);
			input = s.nextInt();	
		}
		stack = sortStack(stack); 
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
