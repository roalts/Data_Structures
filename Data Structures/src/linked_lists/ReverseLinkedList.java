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
	public static Node<Integer> reverseUsingRecursion(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node<Integer> smallerHead = reverseLinkedList(head.next);
//		Node<Integer> tail = smallerHead;
//		while(tail.next != null){
//			tail = tail.next;
//		}
//		tail.next = head;
		head.next.next = head;
		head.next = null;
		return smallerHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = LinkedListUse.takeInput();
		head = reverseUsingRecursion(head);
		LinkedListUse.printLL(head);
	}

}
