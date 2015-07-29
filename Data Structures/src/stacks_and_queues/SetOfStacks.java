package stacks_and_queues;

import java.util.ArrayList;

public class SetOfStacks {
	ArrayList<StackUsingLL<Integer>> stacks = new ArrayList<StackUsingLL<Integer>>();

	public StackUsingLL<Integer> getLastStack() {
		if(stacks.size() == 0) {
			return null;
		} 
		return stacks.get(stacks.size() -1);
	}

	public void push(int element) {
		StackUsingLL<Integer> last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(element);
		} else {
			StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
			stack.push(element);
			stacks.add(stack);
		}
	} 

	public int pop() throws StackEmptyException {
		StackUsingLL<Integer> last = getLastStack();
		int element = last.pop();
		if(last.size() == 0) {
			stacks.remove(getLastStack());
		}
		return element;		
	}

}
