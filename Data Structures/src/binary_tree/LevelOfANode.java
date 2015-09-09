package binary_tree;

import binary_tree.BinaryTreeNode;

public class LevelOfANode {

	public static int levelOfNode(BinaryTreeNode<Integer> root, int d, int level ) {
		if(root == null)
			return 0;
		if(root.data == d)
			return level;
		if(levelOfNode(root.left, d, level+1) != 0)
			return levelOfNode(root.left, d, level+1);
		else
			return levelOfNode(root.right, d, level+1); 
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(levelOfNode(root, 9, 1));
	}
}
