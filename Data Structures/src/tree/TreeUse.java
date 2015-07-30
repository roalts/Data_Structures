package tree;

import java.util.Scanner;

public class TreeUse {

	public static void printTreeSlow(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + ", ");
		}
		for(int i = 0; i < root.children.size(); i++) {
			System.out.println();
			printTreeSlow(root.children.get(i));
		}
	}

	public static void printTree(TreeNode<Integer> root) throws QueueEmptyException {

		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<TreeNode<Integer>>();
		queue.enqueue(root);

		while(!queue.isEmpty()) {
			TreeNode<Integer> currentNode = queue.dequeue();
			String toBePrinted = "" + currentNode.data + ":";
			for(int i = 0; i < currentNode.children.size(); i++) {
				queue.enqueue(currentNode.children.get(i));
				toBePrinted = toBePrinted + currentNode.children.get(i).data + ", ";
			}
			System.out.println(toBePrinted);
		}
	}

	public static TreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
		System.out.println("Enter the root = ");
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<TreeNode<Integer>>();
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>();
		root.data = rootData;
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> currentNode = queue.dequeue();
			System.out.println("Enter num of children for "+ currentNode.data);
			int numChildren = s.nextInt();
			for(int i = 0; i<numChildren; i++) {
				System.out.println("Enter data for " +i+ "th child of " +currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>();
				child.data = childData;
				queue.enqueue(child);
				currentNode.children.add(child);
			}
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInput() {
		System.out.println("Enter the root = ");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>();
		root.data = rootData;
		System.out.println("Enter the number of children for "+ root.data );
		int numChildren = s.nextInt();
		for(int i = 0; i<numChildren; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}

	public static void main(String[] args) throws QueueEmptyException {
		TreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
	}
}
