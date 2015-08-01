package tree;

public class PrintLargestNode {
	public static int largest(TreeNode<Integer> root) {
		if(root == null)
			return -1;
		int rootData = root.data;
		for(int i = 0; i<root.children.size(); i++) {
			int childMaxData = largest(root.children.get(i));
			if(childMaxData > rootData) {
				rootData = childMaxData;
			}
		}
		return rootData;
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		System.out.println(largest(root));
	}
}
