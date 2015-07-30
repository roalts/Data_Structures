package tree;

import java.util.ArrayList;

public class TreeNode<T> {
	
	T data;
	ArrayList<TreeNode<T>> children;
	
	public TreeNode() {
		children = new ArrayList<TreeNode<T>>();
	}
	
}
