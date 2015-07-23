package stacks_and_queues;

import java.util.Queue;

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
	public void enqueue(Node<T> item) {
		count++;
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
		return item;	
	}
}
