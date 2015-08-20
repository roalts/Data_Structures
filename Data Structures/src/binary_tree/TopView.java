package binary_tree;

public class TopView {

	public static void top_view(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		traverse_left(root.left);
		System.out.print(root.data+" ");
		traverse_right(root.right);
	}
	public static void traverse_left(BinaryTreeNode<Integer> x)
	{
		if(x==null)
			return;
		traverse_left(x.left);
		System.out.print(x.data+" ");
	}
	public static void traverse_right(BinaryTreeNode<Integer> x)
	{
		if(x==null)
			return;
		System.out.print(x.data+" ");
		traverse_right(x.right);     
	} 


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		top_view(root);
	}

}
