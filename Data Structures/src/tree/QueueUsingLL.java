package tree;

public class QueueUsingLL<T> {
	
	private Node<T> tail;
	private Node<T> head;
	private int count;
	
	public QueueUsingLL() {
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if(size() == 0)
			return true;
		else
			return false;
	}
	
	public void enqueue(T element) {
		count++;
		Node<T> item = new Node<T>();
		item.data = element;
		if(tail == null) {
			head = item;
			tail = item;
		} else {
			tail.next = item;
			tail = item;
		}
	}
	
	public T dequeue() throws QueueEmptyException {
		if(size() == 0) { 
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		T item = head.data;
		head = head.next;
		if(head == null) 
			tail = null;
		count--;
		return item;	
	}
}
