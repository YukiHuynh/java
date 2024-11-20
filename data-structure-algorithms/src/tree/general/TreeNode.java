package tree.general;

public class TreeNode {

	private String info;			// Giá trị của nút
	private TreeNode firstChild;	// Con cả (FirstChild)
	private TreeNode sibling;		// Nút em kế cận bên phải (Sibling)
	
	public TreeNode(String info) {
		this.info = info;
		this.firstChild = null;
		this.sibling = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public TreeNode getFirstChild() {
		return firstChild;
	}

	public void setFirstChild(TreeNode firstChild) {
		this.firstChild = firstChild;
	}

	public TreeNode getSibling() {
		return sibling;
	}

	public void setSibling(TreeNode sibling) {
		this.sibling = sibling;
	}
	
	@Override
	public String toString() {
		return "TreeNode{" +
                "info='" + info + '\'' +
                '}';
	}
	
}
