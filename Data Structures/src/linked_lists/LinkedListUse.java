package linked_lists;

import java.util.Scanner;

public class LinkedListUse {

	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element = ");
		int input = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while(input != -1) {
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = input;
			if(head == null){
				tail = newNode;
				head = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter the next element = ");
			input = s.nextInt();
		}
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		return;
	}
	public static Node<Integer> insertElement(Node<Integer> head, int position){
		System.out.println("Enter Element = ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		Node<Integer> newNode = new Node<Integer>();
		newNode.data = input;
		if(position == 0){
			newNode.next = head;
			head = newNode;
		}
		else {
			Node<Integer> temp = head;
			while(position > 1 && temp != null){
				temp = temp.next;
				position--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return head;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> tail = head;
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
		tail = insertElement(tail, 3);
		printLL(tail);
		
	}

}
