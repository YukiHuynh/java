package tree.binary;

public class BinaryTreePreorder {
	
	// Preorder traversal: Root → Left → Right
	public void visit(TreeNode node) {
		if(node != null) {
			System.out.println(node.getInfo());	// Output the info of the node
			visit(node.getLeft());				// Visit the left child
			visit(node.getRight());				// Visit the right child
		}
	}
	
}
