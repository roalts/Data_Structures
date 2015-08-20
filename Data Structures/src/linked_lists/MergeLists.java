package linked_lists;

public class MergeLists {

	public static Node<Integer> merge(Node<Integer> headA, Node<Integer> headB) {
		Node<Integer> head = null;
		Node<Integer> tail = null;

		while(headA != null && headB != null) {
			Node<Integer> newNode = new Node<Integer>();
			if(headA.data > headB.data) {
				newNode.data = headB.data;
				headB = headB.next;
				if(head == null) {
					head = newNode;
					tail = newNode;
				} else {
					tail.next = newNode;
					tail = newNode;
				}
			}
			else {		
				newNode.data = headA.data;
				headA = headA.next;
				if(head == null) {
					head = newNode;
					tail = newNode;
				} else {
					tail.next = newNode;
					tail = newNode;
				}
			}
		}
		while(headA != null){
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = headA.data;
			headA = headA.next;
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		while(headB != null){
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = headB.data;
			headB = headB.next;
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> headA = LinkedListUse.takeInput();
		Node<Integer> headB = LinkedListUse.takeInput();
		LinkedListUse.printLL(merge(headA, headB));
	}
}
