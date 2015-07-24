package stacks_and_queues;

public class StackUse {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
}
