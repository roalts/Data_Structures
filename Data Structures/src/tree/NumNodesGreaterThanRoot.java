package tree;

public class NumNodesGreaterThanRoot {

	public static int numberOfGreaterNodes(TreeNode<Integer> root) {
		int count = 0;
		int rootData = root.data;
		for(int i = 0; i < root.children.size(); i++){
			count = numberOfGreaterNodes(root.children.get(i));
			int nodeData = root.children.get(i).data;
			if(nodeData > rootData) 
				count++;
			
		}
		
		return count;
	}
	public static void main(String[] args) throws QueueEmptyException {
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		System.out.println(numberOfGreaterNodes(root));
	}
}
