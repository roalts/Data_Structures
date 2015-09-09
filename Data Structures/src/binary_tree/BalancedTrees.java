package binary_tree;

public class BalancedTrees {

	public static Boolean isTreeBalanced(BinaryTreeNode<Integer> root) {
		if(root == null)
			return true;
		int lh = HeightTree.heightOfTree(root.left);
		int rh = HeightTree.heightOfTree(root.right);
		
		return Math.abs(lh - rh) <= 1 && isTreeBalanced(root.left) && isTreeBalanced(root.right);
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(isTreeBalanced(root));
	}
}
