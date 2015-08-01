package binary_tree;

public class MirrorBinaryTree {

	public static BinaryTreeNode<Integer> mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return null;
		}

		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>();
		BinaryTreeNode<Integer> right = mirrorBinaryTree(root.right);
		temp = right;
		BinaryTreeNode<Integer> left = mirrorBinaryTree(root.left);
		root.left = right;
		root.right = left;
		
		return root;	
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.printBinaryTree(root);
		root = mirrorBinaryTree(root);
		BinaryTreeUse.printBinaryTree(root);
	}
}
