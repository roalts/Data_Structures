package linked_lists;

public class NthNode {

	public static Node<Integer> findNthNode(Node<Integer> head, int n){
		while(head != null){
			if(n == 0){
				return head;
			}
			n--;
			head = head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Node<Integer> head = LinkedListUse.takeInput();
	 head = findNthNode(head, 5);
	 System.out.println(head.data);
	}

}
