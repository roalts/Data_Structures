package binary_tree;

public class MirrorTree {
 
	public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root) {
		if(root == null)
			return root;
		
//		BinaryTreeNode<Integer> left = mirror(root.left);
//		BinaryTreeNode<Integer> right = mirror(root.right);
		BinaryTreeNode<Integer> temp = mirror(root.left);
		root.left = mirror(root.right);
		root.right = temp;
//		left = right;
//		right = temp;
		return root;
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.printBinaryTree(root);
		root = mirror(root);
		BinaryTreeUse.printBinaryTree(root);
	}
}
