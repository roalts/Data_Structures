package linked_lists;


public class SwapNodes {
	
	public static Node<Integer> swap(Node<Integer> head, int position1, int position2){
		Node<Integer> previous1 = head, next1, next2;
		Node<Integer> temp1 = new Node<Integer>();
		Node<Integer> temp2 = new Node<Integer>();
		Node<Integer> previous2 = head;
		while(position2 > 2){
			previous2 = previous2.next;
			position2--;
		}
		
		while(position1 > 2){
			previous1 = previous1.next;
			position1--;
		}

		next2 = previous2;
		temp2 = previous2.next; 
		next2 = next2.next;
		temp2.next = next2.next;

		next1 = previous1;
		temp1 = previous1.next;
		next1 = next1.next;
		temp1.next = next1.next;

		int element2 = next2.data;
		int element1 = next1.data;
		temp1.data = element2;
		temp2.data = element1;
		



		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = LinkedListUse.takeInput();
		//InsertDelete.printLL(head);
		System.out.println();
		head = swap(head, 1, 2);
		LinkedListUse.printLL(head);
	}

}
