package binary_tree;

public class FullBinaryTree {

	public static Boolean checkBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		if(root.left == null || root.right == null)
			return false;
		return checkBinaryTree(root.left) && checkBinaryTree(root.right);
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(checkBinaryTree(root));
	}
}
