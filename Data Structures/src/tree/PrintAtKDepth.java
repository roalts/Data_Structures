package tree;

public class PrintAtKDepth {
	
	public static int height(TreeNode<Integer> root) {
		int maxHeight = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int temp = height(root.children.get(i));
			if (temp > maxHeight) {
				maxHeight = temp;
			}
		}
		return maxHeight+1;
	}

	public static void printAtK(TreeNode<Integer> root, int k) {
		if(k == 1) {
			System.out.println(root.data);
		}
		else {
			for(int i = 0; i < root.children.size(); i++) {
				printAtK(root.children.get(i), k-1);
			}
		}
	}	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
//		System.out.println(height(root));
		printAtK(root, 2);
	}

}
