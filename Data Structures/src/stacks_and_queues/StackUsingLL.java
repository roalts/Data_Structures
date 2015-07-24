package stacks_and_queues;

public class StackUsingLL<T> {

	private Node<T> head;
	private int count;
	
	public StackUsingLL() {
		count = 0;
	}
	
	public T top() throws StackEmptyException {
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	
	public int size() {
		return count;
	}
	public void push(T element) {
		Node<T> item = new Node<T>();
		count++;
		item.data = element;
		item.next = head;
		head = item;
		}
	
	public T pop() throws StackEmptyException{
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		Node<T> item;
		item = head;
		head = head.next;
		count--;
		return item.data;
	}
	
	public boolean isEmpty() {
		if(size() == 0)
			return true;
		else 
			return false;
	}
}
