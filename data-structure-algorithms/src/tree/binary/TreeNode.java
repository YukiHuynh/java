package tree.binary;

public class TreeNode {

	private int info; 		// Holds the value of the node
	private TreeNode left;	// Points to the left child
	private TreeNode right;	// Points to the right child
	
	public TreeNode(int info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return String.valueOf(info);
	}
	
}
