package binary_tree;

public class OrderTraversal {

	public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		postOrderTraversal(root);
		
	}
}
