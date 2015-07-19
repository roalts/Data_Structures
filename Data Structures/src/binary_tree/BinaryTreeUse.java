package data_structures;

import java.awt.geom.CubicCurve2D;
import java.util.Scanner;

public class BinaryTreeUse {

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		Queue<BinaryTreeNode<Integer>> queue = new Queue<BinaryTreeNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = null;
			try {
				currentNode = queue.dequeue();
			} catch (QueueEmptyException e) {
			}

			String toBePrinted = currentNode.data + ":";

			if (currentNode.left != null) {
				toBePrinted = toBePrinted + currentNode.left.data + ",";
				queue.enqueue(currentNode.left);
			}

			if (currentNode.right != null) {
				toBePrinted = toBePrinted + currentNode.right.data;
				queue.enqueue(currentNode.right);
			}
			System.out.println(toBePrinted);
		}
	}

	public static BinaryTreeNode<Integer> takeInput() {
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.data = rootData;
		Queue<BinaryTreeNode<Integer>> queue = new Queue<BinaryTreeNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = null;
			try {
				currentNode = queue.dequeue();
			} catch (QueueEmptyException e) {
			}

			System.out.println("Enter left child for " + currentNode.data);
			int leftData = s.nextInt();

			if (leftData != -1) {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>();
				left.data = leftData;
				currentNode.left = left;
				queue.enqueue(left);
			}

			System.out.println("Enter right child for " + currentNode.data);
			int rightData = s.nextInt();

			if (rightData != -1) {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>();
				right.data = rightData;
				currentNode.right = right;
				queue.enqueue(right);
			}	
		}
		return root;

	}

	public static void printPreOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;	
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int leftD = diameter(root.left);
		int rightD = diameter(root.right);
		
		return Math.max(leftHeight + rightHeight, Math.max(leftD, rightD));
		
	}
	
	public static void main(String args[]) {
		BinaryTreeNode<Integer> root = takeInput();
		printBinaryTree(root);
		printPreOrder(root);
	}
}
