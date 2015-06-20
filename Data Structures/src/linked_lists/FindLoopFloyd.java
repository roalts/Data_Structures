package linked_lists;

public class FindLoopFloyd {
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
		tail4.next = tail;
		
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewNode head = sampleInput();
		
		System.out.println(findLoopFlyodAlgorithm(head));
	}
}
