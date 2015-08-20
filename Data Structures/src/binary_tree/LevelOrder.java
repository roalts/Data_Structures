package binary_tree;

public class LevelOrder {

	public static void levelOrder(BinaryTreeNode<Integer> root)
	{
		int h = height(root);
		for(int i = 0; i <= h; i++) {
			printGivenLevel(root, i);
		}
	}

	public static void printGivenLevel(BinaryTreeNode<Integer> root, int level) {
		if(root == null)
			return;
		if(level == 1) {
			System.out.print(root.data + " ");
		}
		else if(level > 1) {
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}

	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return Math.max(rightHeight, leftHeight) + 1;

	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		levelOrder(root);
	}
}
