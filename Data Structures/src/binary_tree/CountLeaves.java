package binary_tree;

public class CountLeaves {

	public static int countLeaves(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		return countLeaves(root.left) + countLeaves(root.right);
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(countLeaves(root));
	}
}
