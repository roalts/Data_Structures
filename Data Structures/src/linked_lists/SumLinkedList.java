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
	
	public class PartialSum {
		int carry = 0;
		Node<Integer> sum;
	}
	
	public static Node<Integer> reverseSum(Node<Integer> number1, Node<Integer> number2) {
		Node<Integer> head = new Node<Integer>();
		int length1 = linkedListLength(number1);
		int length2 = linkedListLength(number2);
		if(length1 != length2) {
			if(length1 > length2) { 
				number1 = padZeros(number1, length1 - length2);
			} else {
				number2 = padZeros(number2, Math.abs(length1 - length2));
			}
		}
		//Node<Integer> sum = addLinkedList(number1, number2);
		return head;
		
		
	}
	
	
	public static int linkedListLength(Node<Integer> head) {
		int count = 0;
		while(head != null){
			head = head.next;
			count++;
		}
		return count;
	}
	
	public static Node<Integer> padZeros(Node<Integer> head, int padding) {
		Node<Integer> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		for(int i = 0; i < padding; i++) {
			temp.next = new Node<Integer>();
			temp = temp.next;
			temp.data = 0;
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
