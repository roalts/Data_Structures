package binary_tree;

public class EqualTrees {

	public static boolean checkTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		if(root1 == null && root2 == null) 
			return true;
		else if(root1 == null || root2 == null) 
			return false;
		
		if(root1.data == root2.data) {
			boolean right = checkTrees(root1.right, root2.right);
			boolean left = checkTrees(root1.left, root2.left);
			return right && left;
		}
		
		return false;
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root1 = BinaryTreeUse.takeInput();
		BinaryTreeNode<Integer> root2 = BinaryTreeUse.takeInput();
		
		System.out.println(checkTrees(root1, root2));
	}

}
