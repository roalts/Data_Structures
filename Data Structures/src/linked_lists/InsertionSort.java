package linked_lists;

import java.util.Scanner;

public class InsertionSort {

	public static Node<Integer> insert(Node<Integer> head, Node<Integer> newNode){
		Node<Integer> tail = head;
		if(head == null){
			return newNode;
		}
		else if(head.data > newNode.data) {
			newNode.next = head;
			head = newNode;
		}
		else {
			while(tail.next != null) {
				if(newNode.data < tail.next.data) {
					Node<Integer> temp = tail.next;
					tail.next = newNode;
					newNode.next = temp;
					return head;
				}
				tail = tail.next;
			}
		}
		return head;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = LinkedListUse.takeInput();
		Node<Integer> newNode = new Node<Integer>();
		newNode.data = s.nextInt();
		head = insert(head, newNode);
		LinkedListUse.printLL(head);
	}
}
