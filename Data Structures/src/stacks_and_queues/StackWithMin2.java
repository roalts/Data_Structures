package stacks_and_queues;

import java.util.Scanner;

public class StackWithMin2 {

	private Node<Integer> head;
	private StackUsingLL<Integer> s2;
	private int count;

	public StackWithMin2() {
		// TODO Auto-generated constructor stub
		s2 = new StackUsingLL<Integer>();
	}

	public int top() throws StackEmptyException {
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	public int min() throws StackEmptyException {
		if(s2.size() == 0)
			return Integer.MAX_VALUE;
		else
			return s2.top();
	}

	public int size() {
		return count;
	}
	public void push(int element){
		Node<Integer> item = new Node<Integer>();
		count++;
		try{
			if(s2.size() == 0) 
				s2.push(element);
			else if (element <= s2.top()){
				s2.push(element);
			} 
		} catch (StackEmptyException e){
		}

		item.data = element;
		item.next = head;
		head = item;
	}

	public int pop() throws StackEmptyException{
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		Node<Integer> item;
		item = head;
		if(item.data == s2.top())
			s2.pop();
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

	public static void main(String[] args) throws StackEmptyException {
		StackWithMin2 stack = new StackWithMin2();
		System.out.println("Enter element = ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		while(input != -1) {
			stack.push(input);
			System.out.println("Minimum = " + stack.min());
			input = s.nextInt();
		}
	}
}
