package linked_lists;

public class SumLinkedList {

	public static Node<Integer> sum(Node<Integer> number1, Node<Integer> number2) {
		Node<Integer> sumOfTwo = new Node<Integer>();
		int carry = 0;
		Node<Integer> head = sumOfTwo;
		while(number1 != null && number2 != null) {
			sumOfTwo.data = number1.data + number2.data + carry; 
			if(sumOfTwo.data >= 10) {
				carry = sumOfTwo.data/10;
				sumOfTwo.data = sumOfTwo.data % 10;
			}
			sumOfTwo.next = new Node<Integer>();
			sumOfTwo = sumOfTwo.next;
			number1 = number1.next;
			number2 = number2.next;
			if(number1 == null && number2 == null) {
				sumOfTwo.data = carry;
			}
		}
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> number1 = LinkedListUse.takeInput();
		Node<Integer> number2 = LinkedListUse.takeInput();
		Node<Integer> head = sum(number1, number2);
		LinkedListUse.printLL(head);
	}

}
