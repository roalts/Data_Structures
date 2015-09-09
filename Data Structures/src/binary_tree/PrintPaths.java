package binary_tree;

import java.util.ArrayList;

public class PrintPaths {
	public static void printPath(ArrayList<Integer> paths, BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		paths.add(root.data);
		if(root.left == null && root.right == null) {
			for(int i = 0; i < paths.size(); i++) {
				System.out.print(paths.get(i) + " ");
			}
			System.out.println();
		} else {
			printPath(new ArrayList<Integer>(paths), root.left);
			printPath(new ArrayList<Integer>(paths), root.right);
		}
		return;
	
	}

	public static void main(String[] args) throws QueueEmptyException{
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		ArrayList<Integer> paths = new ArrayList<Integer>();
		printPath(paths, root);
	}
}
