package linked_lists;

public class KthFromLast {

	public static int kthFromLast(Node<Integer> head, int k) {
		if(k <= -1)
			return -1;
		Node<Integer> ahead = head;
		for(int i = 0; i < k-1; i++){
			if(ahead == null)
				return -1;
			ahead = ahead.next;
		}
		
		while(ahead.next != null) {
			head = head.next;
			ahead = ahead.next;
		}
		
		return head.data;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		LinkedListUse.printLL(head);
		System.out.println();
		System.out.println(kthFromLast(head, 3));
	}
}
