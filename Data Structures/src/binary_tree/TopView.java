package binary_tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import tree.TreeNode;

public class TopView {

	public static void verticalOrder(BinaryTreeNode<Integer> root, int horizontalDistance, HashMap<Integer, Integer> map) {
		if(root == null) {
			return;
		}
		if(!map.containsKey(horizontalDistance))
			map.put(horizontalDistance, root.data);

		verticalOrder(root.left, horizontalDistance-1, map);
		verticalOrder(root.right, horizontalDistance+1, map);
		return;
	}

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		verticalOrder(root, 0, output);
		
		
	}

}
