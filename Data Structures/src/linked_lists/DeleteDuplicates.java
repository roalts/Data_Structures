package linked_lists;

import java.util.HashSet;

public class DeleteDuplicates {

	public static void deleteDuplicate(Node<Integer> head) {
		if(head == null)
			return ;
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
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		deleteDuplicate(head);
		LinkedListUse.printLL(head);
	}
}
