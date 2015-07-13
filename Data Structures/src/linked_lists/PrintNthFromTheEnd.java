package linked_lists;

public class PrintNthFromTheEnd {

	public static void printFromEnd(Node<Integer> head, int n) {
		//iterative method
		int totalNodes = numberofNodes(head);
		int i = 0;
		Node<Integer> temp = head;
		while (temp != null) {
			if (i == totalNodes - n ) {
				System.out.println(temp.data);
				return;
			}
			temp = temp.next;
			i++;
		}
	}

	public static int numberofNodes(Node<Integer> head) {
		// TODO Auto-generated method stub
		int count = 0;
		Node<Integer> temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Node<Integer> head = LinkedListUse.takeInput();
		printFromEnd(head, 2);

	}
}
