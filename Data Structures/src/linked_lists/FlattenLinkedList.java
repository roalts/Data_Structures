package linked_lists;

import java.math.BigInteger;
import java.util.Scanner;

public class FlattenLinkedList {


	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> result = null;
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		if(head1.data > head2.data) {
			result = head2;
			result.next = merge(head1, head2.next);
		} else {
			result = head1;
			result.next = merge(head1.next, head2);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger z = s.nextBigInteger();
		BigInteger x = s.nextBigInteger();
		
		
	}
}

