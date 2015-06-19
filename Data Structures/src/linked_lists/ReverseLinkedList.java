package linked_lists;

public class ReverseLinkedList {

	public static Node<Integer> reverseLinkedList(Node<Integer> head){
		Node<Integer> tail = head;
		Node<Integer> newHead = head;
		while(head.next != null){
			tail = head.next;
			head.next = tail.next;
			tail.next = newHead;
			newHead = tail;
		}
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = LinkedListUse.takeInput();
		head = reverseLinkedList(head);
		LinkedListUse.printLL(head);
	}

}
