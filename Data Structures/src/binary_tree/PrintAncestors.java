package binary_tree;

public class PrintAncestors {

	public static boolean printAncestors(BinaryTreeNode<Integer> root, int node) {
		if(root == null)
			return false;
		if(root.data == node) 
			return true;
		if(printAncestors(root.left, node) || printAncestors(root.right, node)) {
			System.out.println(root.data);
			return true;
		}
		return false;

	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		if(printAncestors(root, 5))
			System.out.println("YOLO");
	}
}
