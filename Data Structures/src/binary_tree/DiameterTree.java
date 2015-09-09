package binary_tree;

public class DiameterTree {

	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int rightHeight = height(root.right);
		int leftHeight = height(root.left);

		return Math.max(rightHeight, leftHeight) + 1;
	}

	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		int leftDiamter = diameter(root.left);
		int rightDiamter = diameter(root.right);

		return Math.max(leftDiamter, Math.max(rightDiamter, height(root.left) + height(root.right) + 1));
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();	
		System.out.println(diameter(root));
	}
}

