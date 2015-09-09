package binary_tree;

public class MaxNode {
	
	public static int maxNode(BinaryTreeNode<Integer> root) {
		if(root == null)
			return Integer.MIN_VALUE;
		
		int leftMax = maxNode(root.left);
		int rightMax = maxNode(root.right);
		return Math.max(leftMax, Math.max(rightMax, root.data));
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(maxNode(root));
	}

}
