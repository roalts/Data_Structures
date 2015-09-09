package tree;

import java.util.ArrayList;
import java.util.HashMap;

import binary_tree.BinaryTreeNode;
import binary_tree.BinaryTreeUse;

public class VerticalOrder {

	public static HashMap<Integer, Integer> verticalOrder(TreeNode<Integer> root, int horizontalDistance) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if(root == null) {
			return map;
		}
		
		if(!map.containsKey(horizontalDistance))
			map.put(horizontalDistance, root.data);
		verticalOrder(root.left, horizontalDistance-1);
		verticalOrder(root.right, horizontalDistance+1);
		return map;
	}
	

