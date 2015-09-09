package linked_lists;

public class SeachElement {

	public static boolean searchElement(Node<Integer> root, int data) {
		if(root == null)
			return false;
		if(root.data == data)
			return true;
		else
			return searchElement(root.next, data);
	}
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Node<Integer> root = LinkedListUse.takeInput();
		System.out.println(searchElement(root, 4));
	}

}
