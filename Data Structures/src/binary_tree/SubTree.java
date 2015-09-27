package binary_tree;

public class SubTree {

	public static boolean isIdentical(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		if(root2 == null)
			return true;
		return (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	}

	public static boolean isSubGroup(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.data == root2.data){
			return isIdentical(root1, root2);
		}
		return isSubGroup(root1.left, root2) || isSubGroup(root1.right, root2);
	}

	public static void main(String[] args) throws QueueEmptyException  {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root1 = BinaryTreeUse.takeInput();
		BinaryTreeNode<Integer> root2 = BinaryTreeUse.takeInput();
		
		System.out.println(isSubGroup(root1, root2));

	}

}
