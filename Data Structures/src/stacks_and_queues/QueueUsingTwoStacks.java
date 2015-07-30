package stacks_and_queues;

public class QueueUsingTwoStacks {

	StackUsingLL<Integer> stack1 = new StackUsingLL<Integer>(); 
	StackUsingLL<Integer> stack2 = new StackUsingLL<Integer>();
	int count = 0;

	public int size() {
		return count;
	}

	public void enqueue(int element) {
		stack1.push(element);
		count++;
	}
	public void slowEnqueue(int element) throws StackEmptyException {
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack1.push(element);
		while(!stack1.isEmpty()) {
		stack2.push(stack1.pop());
		}
	}
	
	public int fastDequeue() throws StackEmptyException {
		int temp = stack2.pop();
		return temp;
	}
	public int dequeue() {
		int temp = 0;
		while(!stack1.isEmpty()) {
			try{
				stack2.push(stack1.pop());
			} catch (Exception e) {

			}
		}
		try {
			temp = stack2.pop();
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!stack2.isEmpty()) {
			try {
				stack1.push(stack2.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return temp;
	}

}
