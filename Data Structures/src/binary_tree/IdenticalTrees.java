package binary_tree;

public class IdenticalTrees {

	public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		if(root1.data == root2.data) {
			boolean left = identicalTrees(root1.left, root2.left);
			boolean right = identicalTrees(root1.right, root2.right);
			return right && left;
		}
		return false;
			 
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root1 = BinaryTreeUse.takeInput();
		BinaryTreeNode<Integer> root2 = BinaryTreeUse.takeInput();
		
		System.out.println(identicalTrees(root1, root2));
	}

}
