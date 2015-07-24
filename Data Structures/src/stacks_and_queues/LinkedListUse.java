package stacks_and_queues;

import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		System.out.println("Enter the number = ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		while(input != -1) {
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = input;
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter the number = ");
			input = s.nextInt();
		}
		s.close();
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLL(head);
	}
}
