package binary_tree;

public class DeleteTree {

	public static BinaryTreeNode<Integer> deleteTree(BinaryTreeNode<Integer> root) {
		if(root == null)
			return root;
		deleteTree(root.left);
		deleteTree(root.right);
		root = null;
		return root;
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.printBinaryTree(root);
		root = deleteTree(root);
		BinaryTreeUse.printBinaryTree(root);
	}

}
