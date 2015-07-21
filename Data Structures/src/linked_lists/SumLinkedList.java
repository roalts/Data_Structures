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

		int length1 = linkedListLength(number1);
		int length2 = linkedListLength(number2);
		if(length1 != length2) {
			if(length1 > length2) { 
				number2 = padZeros(number2, length1 - length2);
				
			} else {
				number1 = padZeros(number1, Math.abs(length1 - length2));
				
			}
		}
		Node<Integer> tempo = new Node<Integer>();
		Node<Integer> sum = addLinkedList(number1, number2);
		if(sum.carry == 0) {
			return sum;
		} else {
			Node<Integer> temp = new Node<Integer>();
			temp.data = sum.carry;
			temp.next = sum;
			sum = temp;
			return sum;
		}		
	}

	public static Node<Integer> addLinkedList(Node<Integer> number1, Node<Integer> number2) {
		while(number1 != null && number2 != null) {	
			Node<Integer> smallerSum = addLinkedList(number1.next, number2.next);
			Node<Integer> temp = new Node<Integer>();
			temp.data = number1.data + number2.data + smallerSum.carry;
			temp.carry = temp.data/10;
			temp.data = temp.data%10;
			temp.next = smallerSum;
			smallerSum = temp;
			return smallerSum;
		}
		return new Node<Integer>();
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
		for(int i = 0; i < padding; i++) {
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = 0;
			newNode.next = head;
			head = newNode;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> number1 = LinkedListUse.takeInput();
		Node<Integer> number2 = LinkedListUse.takeInput();
		Node<Integer> head = reverseSum(number1, number2);

		LinkedListUse.printLL(head);
	}

}
