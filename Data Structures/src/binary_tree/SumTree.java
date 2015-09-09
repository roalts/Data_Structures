package binary_tree;

public class SumTree {

	public static int isSumTree(BinaryTreeNode<Integer> root) {
		if(root == null) 
			return 0;
		if(root.left == null && root.right == null)
			return root.data;
		int leftData = isSumTree(root.right);
		int rightData = isSumTree(root.left);
		if(root.data == leftData + rightData)
			return root.data + leftData + rightData;
		else
			return Integer.MIN_VALUE;
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(isSumTree(root));
	}
}

