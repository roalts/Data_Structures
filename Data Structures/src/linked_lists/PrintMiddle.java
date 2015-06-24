package linked_lists;

public class PrintMiddle {

	public static int printMiddleNode(Node<Integer> head) {
		Node<Integer> slowPointer = head;
		Node<Integer> fastPointer = head;
		if(head != null) {
			while(fastPointer != null && fastPointer.next != null){
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next.next;
			}
			return slowPointer.data;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = LinkedListUse.takeInput();
		LinkedListUse.printLL(head);
		System.out.println();
		System.out.println(printMiddleNode(head));
	}

}
