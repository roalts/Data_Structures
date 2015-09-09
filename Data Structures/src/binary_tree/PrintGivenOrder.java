package binary_tree;

public class PrintGivenOrder {

	public static void printGivenOrder(BinaryTreeNode<Integer> root, int level) {
		if(root == null)
			return;
		if(level == 1)
			System.out.print(root.data + " ");
		else {
			printGivenOrder(root.left, level-1);
			printGivenOrder(root.right, level-1);
		}
		return;
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		int h = MaxHeight.maxHeight(root);
		for(int i = 1; i <= h; i++) {
			printGivenOrder(root, i);
		}
	}
}
