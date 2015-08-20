package linked_lists;

public class PartitionLL {

	public static Node<Integer> partition(Node<Integer> head, int data) {
		Node<Integer> lowHead = null, lowTail = null;
		Node<Integer> highHead = null, highTail = null;
		
		while(head != null) {
			if(head.data < data){
				if(lowHead == null){
					lowHead = head;
					lowTail = head;
				} else {
					lowTail.next = head;
					lowTail = head;
				}
			} else {
				if(highHead == null){
					highHead = head;
					highTail = head;
				} else {
					highTail.next = head;
					highTail = head;
				}
			}
			head = head.next;
		}
		if(lowHead != null) {
			lowTail.next = highHead;
			highTail.next = null;
		}
		
		
		return lowHead;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		head = partition(head, 4);
		LinkedListUse.printLL(head);
	}
}
