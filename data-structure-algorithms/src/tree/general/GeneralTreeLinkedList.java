package tree.general;

public class GeneralTreeLinkedList {

	private TreeNode root;	// Nút gốc của cây
	
	public GeneralTreeLinkedList(String rootInfo) {
		this.root = new TreeNode(rootInfo);
	}

	public TreeNode getRoot() {
		return root;
	}
	
	// Thêm một nút con vào một nút cha
	public void addChild(TreeNode parent, String childInfo) {
		TreeNode child = new TreeNode(childInfo);
		if(parent.getFirstChild() == null) {
			parent.setFirstChild(child);	// Gán làm con cả nếu chưa có con nào
		} else {
			TreeNode sibling = parent.getFirstChild();
			while(sibling.getSibling() != null) {
				sibling = sibling.getSibling();	// Duyệt đến nút em kế cuối
			}
			sibling.setSibling(child);	// Thêm vào cuối danh sách em
		}
	}
	
	// Duyệt cây theo thứ tự tiền tố (preorder traversal)
	public void traversePreOrder(TreeNode node) {
		if(node != null) {
			System.out.println(node.getInfo() + " ");	// In giá trị của nút
			traversePreOrder(node.getFirstChild());		// Duyệt nút con cả
			traversePreOrder(node.getSibling());		// Duyệt các nút em kế cận
		}
	}
	
}
