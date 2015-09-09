package binary_tree;

public class ChildrenSum {

	public static int isChildSum(BinaryTreeNode<Integer> root) {
		int leftData = 0, rightData = 0;
		if(root == null || root.left == null && root.right == null )
			return 1;
		
		if(root.left != null)
			leftData = root.left.data;
		if(root.right != null)
			rightData = root.right.data;
		
		if((root.data == leftData + rightData) && isChildSum(root.left) == 1 && isChildSum(root.right) == 1)
				return 1;
		else
			return -1;
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(isChildSum(root));
	}
}
