package linked_lists;

public class LengthLinkedList {

	public static int findLength(Node<Integer> head){
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	public static int findLengthRecursice(Node<Integer> head){
		if(head == null){
			return 0;
		} else {
			return 1 + findLengthRecursice(head.next);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = LinkedListUse.takeInput();
		System.out.println(findLength(head));
		System.out.println(findLengthRecursice(head));
	}

}
