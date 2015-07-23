package linked_lists;

import java.util.Scanner;

public class FindLoop {
	public static boolean findLoop(NewNode head){
		while(head != null){
			if(!head.isVisited()){
				head.visited = true;
				head = head.next;
			}
			else
				return true;
		}
		return false;
	}
	
	public static NewNode meetingPoint(NewNode head) {
		if(head == null){
			return head;
		}
		NewNode fast = head;
		NewNode slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				return slow;
		}
		return slow;
	}
	
	public static NewNode findStartOfLoop(NewNode head) {
		NewNode slow = head;
		NewNode fast = meetingPoint(head);
		while(head != null) {
			if(slow == fast)
				return slow;
			fast = fast.next;
			slow = slow.next;
		}
		return null;
	}
	public static NewNode takeInput(){
		NewNode head, tail;
		head = tail = null;
		System.out.println("Enter the element = ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		while(input != -1){
			NewNode newNode = new NewNode();
			newNode.data = input;
			if(head == null){
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter next Element");
			input = s.nextInt();
		}
		return head;
	}
	public static boolean findLoopFlyodAlgorithm(NewNode head){
		NewNode fastNode = head;
		
		
		while(fastNode != null && fastNode.next != null && head != null){
				head = head.next;
				fastNode = fastNode.next.next;
				if(head == fastNode){
					return true;
				}
		}
		return false;
	}
	public static NewNode sampleInput(){
		NewNode head = new NewNode();
		NewNode tail = new NewNode();;
		NewNode tail2 = new NewNode();;
		NewNode tail3 = new NewNode();;
		NewNode tail4 = new NewNode();;
		NewNode tail5 = new NewNode();;
		
		head.data = 1;
		tail.data = 2;
		head.next = tail;
		tail2.data = 3;
		tail.next = tail2;
		tail3.data = 4;
		tail2.next = tail3;
		tail4.data = 5;
		tail3.next = tail4;
		tail4.next = tail2;
		
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewNode head = sampleInput();
		
		System.out.println(findStartOfLoop(head).data);
	}
}
