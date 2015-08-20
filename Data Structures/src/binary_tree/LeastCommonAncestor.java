package binary_tree;

public class LeastCommonAncestor {

	public static BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root,int v1,int v2)
	{
		if(root == null)
			return root;
		
		if(root.data < v1 && root.data < v2) {
			return lca(root.right, v1, v2);
		}
		else if(root.data > v1 && root.data > v2) {
			return lca(root.left, v1, v2);
		}
		else 
			return root;

	}
	
	public static void main(String[] args) throws QueueEmptyException  {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(lca(root, 6 , 6).data);
	}

}
