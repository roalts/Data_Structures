package binary_tree;

public class SumLeftLeaves {

	public static int sumLeftLeaves(BinaryTreeNode<Integer> root, Boolean left) {
		if(root == null)
			return 0;
		if(left && root.left == null && root.right == null) {
			return root.data;
		}
		return sumLeftLeaves(root.left, true) + sumLeftLeaves(root.right, false);
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(sumLeftLeaves(root, false));
	}
}
