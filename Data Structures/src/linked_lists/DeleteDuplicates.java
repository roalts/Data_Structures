package linked_lists;

import java.util.HashSet;

public class DeleteDuplicates {

	public static void deleteDuplicate(Node<Integer> head) {
		if(head == null)
			return;
		Node<Integer> previous = null;
		HashSet<Integer> set = new HashSet<Integer>();
		while(head != null) {
			if(set.contains(head.data)){
				previous.next = head.next;
			} else {
				set.add(head.data);
				previous = head;
			}
			head = head.next;
		}
		return;
	}
	
	public static void deleteDuplicateWithoutBuffer(Node<Integer> head) {
		if(head == null)
			return;
		Node<Integer> current = head;
		while(current != null) {
			Node<Integer> runner = current;
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return;
	}
	
	//Not having the buffer to store duplicates
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
	//	deleteDuplicate(head);
		deleteDuplicateWithoutBuffer(head);
		LinkedListUse.printLL(head);
	}
}
