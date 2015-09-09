package binary_tree;

public class MaxHeight {

	public static int maxHeight(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int rightHeight = maxHeight(root.right);
		int leftHeight = maxHeight(root.left);
		return Math.max(leftHeight, rightHeight) + 1;
		
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root1 = BinaryTreeUse.takeInput();
		BinaryTreeNode<Integer> root2 = BinaryTreeUse.takeInput();
		
		System.out.println(maxHeight(root1));
		System.out.println(maxHeight(root2));
	}

}
