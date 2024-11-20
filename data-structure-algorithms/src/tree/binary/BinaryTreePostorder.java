package tree.binary;

public class BinaryTreePostorder {

	public void visit(TreeNode node) {
		if(node != null) {
			visit(node.getLeft());				// Visit the left child
			visit(node.getRight());				// Visit the right child
			System.out.println(node.getInfo());	// Output the info of the node
		}
	}
	
}
