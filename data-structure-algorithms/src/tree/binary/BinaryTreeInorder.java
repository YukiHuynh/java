package tree.binary;

public class BinaryTreeInorder {
	
	// Inorder traversal: Left → Root → Right
	public void visit(TreeNode node) {
		if(node != null) {
			visit(node.getLeft());				// Visit the left child
			System.out.println(node.getInfo());	// Output the info of the node
			visit(node.getRight());				// Visit the right child
		}
	}

}
