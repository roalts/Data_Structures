package linked_lists;

import java.util.Scanner;

public class DeleteNode {

	public static Node<Integer> takeInput() {
		System.out.println("Enter the element = ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (input != -1) {
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = input;
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter the next element = ");
			input = s.nextInt();
			
		}
		s.close();
		return head;
	}
	
	public static void deleteNode(Node<Integer> node){
		
			if(node.next != null){
				Node<Integer> temp = node.next;
				node.data = temp.data;
				node.next = temp.next;
			} else {
				node = null;
			}
	}
public static Node<Integer> delete(Node<Integer> head, int position) {
    if(position == 0){
        head = head.next;
        return head;
    }
    Node<Integer> currentNode = head;
    while(position > 1) {
        position--;
        currentNode = currentNode.next;
    }
    if(currentNode.next != null) 
        currentNode = currentNode.next.next;
    else {
        currentNode = null;
    }
    return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> tail = head;
		while(tail.next != null){
			tail = tail.next;
		}
//		deleteNode(tail);
		head=delete(head, 1);
		LinkedListUse.printLL(head);
		
	}

}
