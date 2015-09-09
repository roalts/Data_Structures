package binary_tree;

public class SizeOfTree {

	public static int treeSize(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftTree = treeSize(root.left);
		int rightTree = treeSize(root.right);
		
		return leftTree + rightTree + 1;
			
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(treeSize(root));
		
	}
}
