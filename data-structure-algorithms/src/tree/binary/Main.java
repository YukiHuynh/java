package tree.binary;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating nodes
		TreeNode root = new TreeNode(1);
		TreeNode leftChild = new TreeNode(2);
		TreeNode rightChild = new TreeNode(3);
		TreeNode leftLeftChild = new TreeNode(4);
		TreeNode leftRighthChild = new TreeNode(5);
		
		// Building the tree
		root.setLeft(leftChild);
		root.setRight(rightChild);
		leftChild.setLeft(leftLeftChild);
		leftChild.setRight(leftRighthChild);
		
		// Tree traversal
		BinaryTreePreorder tree = new BinaryTreePreorder();
		System.out.println("Preorder Traversal:");
		tree.visit(root);
		
		BinaryTreeInorder tree1 = new BinaryTreeInorder();
		System.out.println("Inorder Traversal:");
		tree1.visit(root);
		
		BinaryTreePostorder tree2 = new BinaryTreePostorder();
		System.out.println("Postorder Traversal:");
		tree2.visit(root);
		
	}

}
