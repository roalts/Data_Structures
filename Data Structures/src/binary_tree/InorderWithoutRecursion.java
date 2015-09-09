package binary_tree;

public class InorderWithoutRecursion {

	public static void inorder(BinaryTreeNode<Integer> root) throws StackEmptyException {
		StackUsingLL<BinaryTreeNode<Integer>> stack = new StackUsingLL<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> temp = root;
		stack.push(root);
		boolean check = true;
		while(!stack.isEmpty() && check) {
			while(root.left != null) {
				root = root.left;
				stack.push(root);
			}
			temp = stack.pop();
			root = temp;
			System.out.print(root.data);
			if(root.right != null) {
				root = root.right;
				stack.push(root);
			} else {
				while(root.right == null) {
					root = stack.pop();
					System.out.println(root.data);
				}
				
			}
		}
	}
	public static void main(String[] args) throws QueueEmptyException, StackEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
		inorder(root);
	}

}
