package linked_lists;

public class FindElement {

	public static boolean findElement(Node<Integer> head, int element){
		while(head != null) {
			if(head.data == element)
				return true;
			head = head.next;
		}
		return false;
	}
	
	public static boolean findElementRecursive(Node<Integer> head, int element){
		while(head != null){
			if(head.data == element)
				return true;
			else {
				return findElementRecursive(head.next, element);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = LinkedListUse.takeInput();
		System.out.println(findElementRecursive(null, 3));
	}

}
