package binary_tree;

import java.util.*;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput() throws QueueEmptyException {
		System.out.println("Enter the root = ");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.data = rootData;
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.dequeue();
			System.out.println("Enter the left child for " + currentNode.data);
			int leftData = s.nextInt();
			if(leftData != -1) {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>();
				left.data = leftData;
				currentNode.left = left;
				queue.enqueue(left);
			}
			
			System.out.println("Enter the right child for " + currentNode.data);
			int rightData = s.nextInt();
			if(rightData != -1) {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>();
				right.data = rightData;
				currentNode.right = right;
				queue.enqueue(right);
			}
		}
		return root;
	}
	
	public static void printBinaryTree(BinaryTreeNode<Integer> root) throws QueueEmptyException {
		if(root == null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.dequeue();
			String toBePrinted = currentNode.data + ": ";
			if(currentNode.left != null) {
				toBePrinted = toBePrinted + currentNode.left.data + ", "; 
				queue.enqueue(currentNode.left);
			}
			if(currentNode.right != null) {
				toBePrinted = toBePrinted + currentNode.right.data + ", "; 
				queue.enqueue(currentNode.right);
			}
			System.out.println(toBePrinted);
		}
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = takeInput();
		printBinaryTree(root);
	}
}
