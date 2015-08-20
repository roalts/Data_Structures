package binary_tree;

public class HeightTree {

	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
 	}
	public static void main(String[] args) throws QueueEmptyException{
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(heightOfTree(root));
		
	}

}
