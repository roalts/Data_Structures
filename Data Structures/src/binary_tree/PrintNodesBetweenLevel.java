package binary_tree;

public class PrintNodesBetweenLevel {

	public static void printNodes(BinaryTreeNode<Integer> root, int level, int max, int min) {
		if(root == null)
			return;
		if(level <= max && level >= min) {
			System.out.print(root.data + " ");
		}
		printNodes(root.left, level + 1, max, min);
		printNodes(root.right, level + 1, max, min);
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		printNodes(root, 1 , 4, 2);
	}
}

