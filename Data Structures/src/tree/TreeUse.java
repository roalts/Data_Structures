package tree;

import java.util.Scanner;

public class TreeUse {
	public static TreeNode<Integer> takeInput() {
		System.out.println("Enter the root = ");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>();
		root.data = rootData;
		System.out.println("Enter the cnumber of children for "+ root.data );
		int numChildren = s.nextInt();
		for(int i = 0; i<numChildren; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = takeInput();
		
	}
}
