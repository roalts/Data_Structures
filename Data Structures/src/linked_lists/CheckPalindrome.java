package linked_lists;

public class CheckPalindrome {

	public static Node<Integer> returnMiddle(Node<Integer> head) {
		Node<Integer> slowPointer = head;
		Node<Integer> fastPointer = head;
		if(head != null){
			while(fastPointer != null && fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
				slowPointer = slowPointer.next;
			}
			return slowPointer;
		}
		return null;
	}
	
	public static Node<Integer> reverseLL(Node<Integer> head) {
		//reverse linked list
		if(head == null || head.next == null){
			return head;
		}
		
		Node<Integer> smallerHead = reverseLL(head.next);
		
		head.next.next = head;
		head.next = null;
		return smallerHead;
	}
	public static boolean checkPalindrome(Node<Integer> head) {
		//to check for pallindrome
		Node<Integer> mid = head;
		if(head != null) {
			mid = returnMiddle(head);
			mid = reverseLL(mid);
		}
		while(head != null && mid != null) {
			if(head.data != mid.data)
				return false;
			else {
				mid = mid.next;
				head = head.next;
			}
				
		}
		return true;
	}
	public static boolean isPalindrome(Node<Integer> head, int length) {
		if(head == null || length == 0) {
			return true;
		} else if (length == 1) {
			
		}
	}
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		System.out.println(checkPalindrome(head));
		
	}
}
 