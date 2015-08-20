package linked_lists;

public class KReverse {

	public static Node<Integer> reverse (Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> smallHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static Node<Integer> kReverse(Node<Integer> head, int k){
		if(head == null) 
			return head;
		int kTemp = k;
		Node<Integer> tempHead = head;
		while(tempHead.next != null && kTemp > 1) {
			tempHead = tempHead.next;
			kTemp--;
		}
		Node<Integer> temp = tempHead.next;
		tempHead.next = null;
		head = reverse(head);
		tempHead = head;
		kTemp = k;
		while(tempHead.next != null && kTemp > 1) {
			tempHead = tempHead.next;
			kTemp--;
		}
		temp = kReverse(temp,k);
		tempHead.next = temp;
		return head;
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		head = kReverse(head, 4);
		LinkedListUse.printLL(head);
	}
}
