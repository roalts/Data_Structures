package stacks_and_queues;

class NewNode {
	int data;
	NewNode next;
	int min;
	
}
public class StackWithMin {
	NewNode head;
	int count;
	
	public StackWithMin() {
		count = 0;
	}
	
	public void push(int element) {
		NewNode temp = new NewNode();
		temp.data = element;
		temp.min = Math.min(temp.data, min());
		count++;
		temp.next = head;
		head = temp;
	}
	
	public int min() {
		if(size() == 0)
			return Integer.MAX_VALUE;
		else
			return top().min;
	}
	
	public NewNode top() {
		if(size() == 0)
			return null;
		else 
			return head;
		}
	public int size() {
		return count;
	}
	
	public int pop() {
		if(size() == 0)
			return -1;
		else {
			int temp = head.data;
			head = head.next;
			count--;
			return temp;
		}
	}
	
	
	public static void main(String[] args){
		StackWithMin stack = new StackWithMin();
		for(int i = 10; i>0; i--) {
			stack.push(i);
		}
	
		while(stack.size() != 0) {
			System.out.println("Element pop = " + stack.pop());
			System.out.println("Minimum = " + stack.min());
		}
	}
}
